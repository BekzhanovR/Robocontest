<?php

    $n = intval(trim(fgets(STDIN)));
    $a = array_map('intval', explode(' ', trim(fgets(STDIN))));

    sort($a);

    echo $a[$n-2];

?>
