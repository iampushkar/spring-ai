document.addEventListener('DOMContentLoaded', function () {
  const input = document.getElementById('queryInput');
  const btn = document.getElementById('sendBtn');
  const responseBox = document.getElementById('responseBox');

  async function sendQuery() {
    const q = input.value.trim();
    if (!q) return;
    btn.disabled = true;
    btn.textContent = 'Sending...';
    responseBox.textContent = '';
    try {
      const resp = await fetch(`/api/ai/${encodeURIComponent(q)}`);
      if (!resp.ok) {
        const text = await resp.text();
        responseBox.textContent = `Error: ${resp.status} ${text}`;
      } else {
        const text = await resp.text();
        responseBox.textContent = text;
      }
    } catch (e) {
      responseBox.textContent = 'Network error: ' + e.message;
    } finally {
      btn.disabled = false;
      btn.textContent = 'Send';
    }
  }

  btn.addEventListener('click', sendQuery);

  input.addEventListener('keydown', function (e) {
    if (e.key === 'Enter') {
      sendQuery();
    }
  });
});
