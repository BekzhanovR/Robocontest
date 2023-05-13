<?php 
    $n = readline();
    list($a,$b,$c) = explode(' ',readline());
    $sum = $a + $b + $c;
    if($sum < $n){
        $result = "No";
    }else{
        $result = "Yes";
    }
    print_r($result);
?>