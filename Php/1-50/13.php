<?php
$input = readline();
$inputs = explode(" ", $input);
$n = intval($inputs[0]);
$k = intval($inputs[1]);

if ($n == 0) {
    echo "1\n";
} else {
    echo ($k + 1) . "\n";
}
?>