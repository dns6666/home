<%@ attribute name="id" required="true"%>
<%@ attribute name="date" required="false"%>


<input type="text" id="${id}" name="${id}" readonly="readonly" value="${date}" />
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