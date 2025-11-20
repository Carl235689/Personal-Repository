Slides conversion and submission

To convert the slides (Markdown) to PowerPoint (PPTX) using Pandoc:

1. Install Pandoc and optionally a TeX engine if you need advanced features.

2. Run:

```bash
pandoc slides.md -o WrapperSlides.pptx
```

This will produce `WrapperSlides.pptx` in the same folder.

If you prefer to export from VS Code with syntax highlighting for code blocks, you can use Carbon or other tools and place images into slides.

References are included in `slides.md`.
