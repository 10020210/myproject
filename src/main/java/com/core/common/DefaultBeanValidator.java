package com.core.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.core.exception.ErrorMessage;
import com.core.exception.InvalidDataException;

public class DefaultBeanValidator {

    // private static final Logger LOG = Logger.getLogger(DefaultBeanValidator.class);

    private static final ValidatorFactory FACTORY = Validation.buildDefaultValidatorFactory();
    private static final Validator VALIDATOR = FACTORY.getValidator();

    public static Validator getInstance() {
        return VALIDATOR;
    }

    public static final <T> void validate(final T object) throws InvalidDataException {
        final Set<ConstraintViolation<T>> violations = VALIDATOR.validate(object);
        final Iterator<ConstraintViolation<T>> iterator = violations.iterator();
        final List<ErrorMessage> errors = new ArrayList<ErrorMessage>();
        ConstraintViolation<T> violation;
        while (iterator.hasNext()) {
            violation = iterator.next();
            errors.add(new ErrorMessage("global.error.invalid", new String[] { violation.getPropertyPath().toString() }));
        }
        if (!errors.isEmpty()) {
            throw new InvalidDataException(errors);
        }
    }

    public static final <T> List<ErrorMessage> validate(final T object, List<ErrorMessage> errors) throws InvalidDataException {
        final Set<ConstraintViolation<T>> violations = VALIDATOR.validate(object);
        final Iterator<ConstraintViolation<T>> iterator = violations.iterator();
        ConstraintViolation<T> violation;
        while (iterator.hasNext()) {
            violation = iterator.next();
            errors.add(new ErrorMessage("global.error.invalid", new String[] { violation.getPropertyPath().toString() }));
        }
        return errors;
    }

}
