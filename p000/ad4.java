package p000;

import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ad4 extends Writer {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f264a;

    /* JADX INFO: renamed from: b */
    public final zc4 f265b = new zc4();

    public ad4(StringBuilder sb) {
        this.f264a = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f264a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        zc4 zc4Var = this.f265b;
        zc4Var.f35981a = cArr;
        zc4Var.f35982b = null;
        this.f264a.append((CharSequence) zc4Var, i, i2 + i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f264a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.f264a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.f264a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        Objects.requireNonNull(str);
        this.f264a.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.f264a.append((char) i);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
