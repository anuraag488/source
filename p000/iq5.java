package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iq5 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21653a;

    /* JADX INFO: renamed from: b */
    public int f21654b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sq5 f21655c;

    public /* synthetic */ iq5(byte b) {
        this.f21653a = b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21653a) {
            case 0:
                return this.f21654b < this.f21655c.f30510a.length();
            default:
                return this.f21654b < this.f21655c.f30510a.length();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f21653a) {
            case 0:
                String str = this.f21655c.f30510a;
                int i = this.f21654b;
                if (i < str.length()) {
                    this.f21654b = i + 1;
                    return new sq5(String.valueOf(i));
                }
                xy4.m12795x();
                return null;
            default:
                String str2 = this.f21655c.f30510a;
                int i2 = this.f21654b;
                if (i2 < str2.length()) {
                    this.f21654b = i2 + 1;
                    return new sq5(String.valueOf(str2.charAt(i2)));
                }
                xy4.m12795x();
                return null;
        }
    }
}
