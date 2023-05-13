<?php
$n = intval(trim(fgets(STDIN)));
$s = array_map('intval', explode(' ', trim(fgets(STDIN))));

foreach ($s as $i) {
    if (array_count_values($s)[$i] === 1) {
        echo $i . "\n";
    }
}
?>