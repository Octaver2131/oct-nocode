<template>
  <a-layout-footer class="footer">
    <div class="footer-links">
      <a
        v-for="item in linkList"
        :key="item.key"
        :href="item.href"
        target="_blank"
        rel="noopener noreferrer"
        class="link-item"
      >
        <component :is="item.icon" v-if="item.icon" class="icon" />
        {{ item.title }}
      </a>
    </div>
    <div class="copyright">
      {{ currentYear }} {{ defaultMessage }}
    </div>
  </a-layout-footer>
</template>

<script setup lang="ts">
import { GithubOutlined } from '@ant-design/icons-vue';

const defaultMessage = 'Octaver';
const currentYear = new Date().getFullYear();

const linkList = [
  {
    key: 'tutor',
    title: '鱼皮',
    href: 'https://github.com/liyupi',
    icon: null
  },
  {
    key: 'github',
    title: 'NoCode',
    href: 'https://github.com/Octaver2131',
    icon: GithubOutlined
  },
  {
    key: 'author',
    title: '欧可',
    href: 'https://github.com/Octaver2131',
    icon: null
  }
];
</script>

<style scoped>
.footer {
  background: none;
  text-align: center;
  padding: 16px 0;
  margin-top: auto;
}

.footer-links {
  margin-bottom: 8px;
}

.link-item {
  margin: 0 8px;
  color: #666;
  font-size: 14px;
  text-decoration: none;
}

.link-item:hover {
  color: #1890ff;
}

.icon {
  margin-right: 4px;
}

.copyright {
  color: #666;
  font-size: 14px;
}
</style>
