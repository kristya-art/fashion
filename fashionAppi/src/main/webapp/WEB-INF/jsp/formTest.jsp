<html>

<form id="form2" action="formTest">

<input type="text" name = "yourname" id="yourname" placeholder="type your name">
<button type="submit" id="btn2">go</button>
</form>

</html>

<script>
 $(document).ready(funtion(){
	 $('#btn2').click(funtion(){
		 document.getElementById('form2').submit();
	 });
 });
</script>
