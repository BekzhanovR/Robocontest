<?php
    $n = intval(fgets(STDIN));
    $k = 1;
    $f = 0;
    for ($i = 0; $i < $n; $i++) {
    $temp = $k + $f;
    $f = $k;
    $k = $temp;
    }
    echo $f * 2;
?>