<?php
$z = intval(readline());
$s = 0;
$n = 0;
if ($z == 0) {
  $s = -1;
} else {
  if ($z < 0) {
    $n = -$z;
  } else {
    $n = $z;
  }
  $i = 1;
  while ($i * $i <= $n) {
    if ($n % $i == 0) {
      $s += 1;

      if ($i * $i != $n) {
        $s += 1;
      }
    }
    $i += 1;
  }
  if ($s % 2 && $z > 0) {
    $s += 1;
  }
}

echo $s;
?>
