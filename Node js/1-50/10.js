function solve(n, a, b, c) {
	let sum = a + b + c
    if(n <= sum){
    	return "Yes";
    }else{
    	return "No"
    }
}