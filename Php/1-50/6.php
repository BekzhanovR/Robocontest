<?php
    $yil = readline();
    $x = '';
    if($yil < 10){
        $x = '000';
    }elseif($yil < 100){
        $x = '00';
    }elseif($yil < 1000){
        $x = '0';
    }
    if($yil % 400 == 0 or $yil % 4 == 0 and $yil % 100!=0){
        $x = "12/09/".$x.+strval($yil);
    }else{
        $x = "13/09/".$x.+strval($yil);
    }
	print_r($x);
?>