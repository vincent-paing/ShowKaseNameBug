package dev.aungkyawpaing.libmodule

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ComposeFromAnotherModule() {
  Text("Compose from Another Module")
}

@PreviewGroupFromAnotherModule
@Composable
fun ComposeFromAnotherModulePreview() {
  ComposeFromAnotherModule()
}