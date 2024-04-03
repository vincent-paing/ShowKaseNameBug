package dev.aungkyawpaing.showkasename

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.aungkyawpaing.libmodule.PreviewGroupFromAnotherModule

@Composable
fun UnstableNameComposable() {
  Text("Unstable name Composable")
}

@PreviewGroupFromAnotherModule
@Composable
fun ComposeFromAnotherModulePreview() {
  UnstableNameComposable()
}
