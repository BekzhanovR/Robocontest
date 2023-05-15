<?php

$input = readline();
$inputs = explode(" ", $input);
$n = intval($inputs[0]);
$k = intval($inputs[1]);

$output;
if ($n == 0) {
    $output = 1;
} else {
    $output = modularPow($k + 1, $n, 1000000007);
}

echo $output;

function modularPow($baseNumber, $exponent, $modulus) {
    $result = 1;
    $base = $baseNumber;
    $mod = $modulus;

    while ($exponent > 0) {
        if ($exponent % 2 == 1) {
            $result = ($result * $base) % $mod;
        }
        $base = ($base * $base) % $mod;
        $exponent = intdiv($exponent, 2);
    }

    return $result;
}
?>