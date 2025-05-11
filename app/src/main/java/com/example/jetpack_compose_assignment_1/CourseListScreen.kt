package com.example.jetpack_compose_assignment_1


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable
fun CourseListScreen(courses: List<Course>) {
    LazyColumn {
        items(courses) { course ->
            CourseCard(course)
        }
    }
}
