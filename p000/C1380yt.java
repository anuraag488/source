package p000;

import android.content.Context;

/* JADX INFO: renamed from: yt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1380yt extends ar0 {

    /* JADX INFO: renamed from: a */
    public Context f35508a;

    /* JADX INFO: renamed from: b */
    public ja0 f35509b;

    /* JADX INFO: renamed from: c */
    public ja0 f35510c;

    /* JADX INFO: renamed from: d */
    public String f35511d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ar0) {
            C1380yt c1380yt = (C1380yt) ((ar0) obj);
            if (this.f35508a.equals(c1380yt.f35508a) && this.f35509b.equals(c1380yt.f35509b) && this.f35510c.equals(c1380yt.f35510c) && this.f35511d.equals(c1380yt.f35511d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35511d.hashCode() ^ ((((((this.f35508a.hashCode() ^ 1000003) * 1000003) ^ this.f35509b.hashCode()) * 1000003) ^ this.f35510c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f35508a);
        sb.append(", wallClock=");
        sb.append(this.f35509b);
        sb.append(", monotonicClock=");
        sb.append(this.f35510c);
        sb.append(", backendName=");
        return zi4.m13623w(sb, this.f35511d, "}");
    }
}
