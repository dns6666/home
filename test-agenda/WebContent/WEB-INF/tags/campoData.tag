<%@ attribute name="id" required="true"%>

<input type="text" id="${id}" name="${id}" readonly="readonly"/>
<script>
	$("#${id}").datepicker({
		dateFormat : 'dd/mm/yy',
		changeMonth : true,
		changeYear : true,
		showOtherMonths : true,
		showOn : "button",
		buttonImage : "images/calendar_icon.gif",
		buttonImageOnly : true,
		buttonText : "Selecionar a data",
		minDate : "-50Y",
		maxDate : "-10D"
	});
</script>