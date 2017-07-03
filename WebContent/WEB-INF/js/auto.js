$('#boarding').autocomplete({
		      	source: function( request, response ) { $.ajax({		      	
		      			url : 'Controller?Action=source',
		      			dataType: "json",
						data: {
						   name_startsWith: request.term,
						   type: 'source',
						},
						 success: function( data ) {
							response( $.map( data, function( item ) {
						 	var code = item.split("|");
							return {
								label: code[0],
								value: code[0],
								data : item
							}
						}));
						}
		      		});
		      	},
		      	autoFocus: true,
		      	minLength: 0,
					select: function( event, ui ) {
						if( typeof ui.item.data !== "undefined" ){
							var names = ui.item.data.split("|");
							$('#boarding').val(names[0]);
							$('#boardingid').val(names[1]);
						}else{
							return false;
						}

					}				
		      });
$('#leaving').autocomplete({
  	source: function( request, response ) {
  		$.ajax({
  			url : 'Controller?Action=destination',
  			dataType: "json",
			data: {
			   name_startswith: request.term,
			   type: 'destination',
			},
			 success: function( data ) {
				response( $.map( data, function( item ) {
			 	var code = item.split("|");
				return {
					label: code[0],
					value: code[0],
					data : item
				}
			}));
			}
  		});
  	},
  	autoFocus: true,
  	minLength: 0,
		select: function( event, ui ) {
			if( typeof ui.item.data !== "undefined" ){
				var names = ui.item.data.split("|");
				$('#leaving').val(names[0]);
				$('#leavingid').val(names[1]);
			}else{
				return false;
			}

		}				
  });		      
