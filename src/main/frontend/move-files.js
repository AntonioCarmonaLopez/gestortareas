
const fs = require('fs');
const path = require('path');

const browserDir = path.join(__dirname, '../../../target/classes/static/browser');
const staticDir = path.join(__dirname, '../../../target/classes/static');

if (fs.existsSync(browserDir)) {
  const files = fs.readdirSync(browserDir);
  files.forEach(file => {
    fs.renameSync(
      path.join(browserDir, file),
      path.join(staticDir, file)
    );
  });
  fs.rmdirSync(browserDir);
  console.log('Archivos movidos de browser/ a static/');
}

