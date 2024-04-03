package dev.aungkyawpaing.showkasename

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.aungkyawpaing.libmodule.PreviewGroupFromAnotherModule

@Composable
fun ComposableA() {
  Text("Composable Two")
}

/*
 Deleting this preview/changing the preview group to @PreviewGroupFromSameModule or @Preview
 does not affect ComposableOnePreview
 */
//@PreviewGroupFromAnotherModule
//@Composable
//fun ComposableAPreview() {
//  ComposableA()
//}
