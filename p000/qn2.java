package p000;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qn2 extends Writer {

    /* JADX INFO: renamed from: a */
    public final StringBuilder f28621a = new StringBuilder(128);

    /* JADX INFO: renamed from: a */
    public final void m9990a() {
        StringBuilder sb = this.f28621a;
        if (sb.length() > 0) {
            Log.d("FragmentManager", sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m9990a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m9990a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m9990a();
            } else {
                this.f28621a.append(c);
            }
        }
    }
}
