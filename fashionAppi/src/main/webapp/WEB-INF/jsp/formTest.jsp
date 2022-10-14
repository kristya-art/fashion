<html>

<script src="https://www.google.com/recaptcha/api.js"></script>

<div>
<form id="form2"  class="form2" action="formTest">

	<input type="text" name = "firstname" id="firstname" placeholder="first name">
	<div class="g-recaptcha" data-sitekey="6LdYNtUhAAAAAMDD21f6o7j1Sv9on4ihzPUSJS90" data-size="invisible" data-badge="inline"></div>
	<button  class="g-recaptcha btn btn-primary" 
		data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI" 
		id="btn2"
		data-callback="onSubmit"
		data-action="submit">go</button>
 
</form>
</div>


</html>

<script>

 
 
 // recaptcha
 function onSubmit(token){
	 document.getElementById('form2').submit();
 }
</script>

<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

button {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}



</style>






