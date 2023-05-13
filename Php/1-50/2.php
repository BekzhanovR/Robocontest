<?php 
    list($a,$b) = explode(" ",readline());
    if($a == $b){
        print_r("=");
    }elseif($a > $b){
        print_r(">");
    }else{
        print_r("<");
    }
?>