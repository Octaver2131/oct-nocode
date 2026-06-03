<script setup lang="ts">
import BasicLayout from '@/layouts/BasicLayout.vue'

import { index } from '@/api/testController.ts'

index().then((res) => {
  console.log(res)
})
</script>

<template>
  <BasicLayout />
</template>

<style>
</style>
