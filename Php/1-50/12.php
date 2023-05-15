<?php
$n = intval(readline());
$a = [];
for ($i = 0; $i <= $n; $i++) {
    $a[] = $i;
}

$a[1] = 0;
$i = 2;
while ($i <= $n) {
    if ($a[$i] != 0) {
        $j = $i + $i;
        while ($j <= $n) {
            $a[$j] = 0;
            $j = $j + $i;
        }
    }
    $i += 1;
}

$a = array_filter($a);
$a = array_diff($a, [0]);
$ism = ["Bobur", "Ali"];

if ($n == 1) {
    echo "Ali\n";
} else {
    echo $ism[count($a) % 2] . "\n";
}
?>
