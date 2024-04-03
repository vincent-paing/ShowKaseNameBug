package dev.aungkyawpaing.showkasename

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.aungkyawpaing.libmodule.PreviewGroupFromAnotherModule

@Composable
fun ComposableB() {
  Text("Unstable name Composable")
}

@PreviewGroupFromAnotherModule
@Composable
fun ComposableBPreview() {
  ComposableB()
}
