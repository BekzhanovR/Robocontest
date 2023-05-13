<?php
    $n = array_map('intval', explode(' ', trim(fgets(STDIN))));

    $result1 = array_sum($n) - max($n);
    $result2 = array_sum($n) - min($n);

    echo $result1 . ' ' . $result2 . "\n";
?>
