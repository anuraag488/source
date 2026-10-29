package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gl2 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public CharSequence f19853a;

    /* JADX INFO: renamed from: b */
    public byte f19854b;

    /* JADX INFO: renamed from: c */
    public int f19855c;

    /* JADX INFO: renamed from: d */
    public int f19856d;

    /* JADX INFO: renamed from: e */
    public int f19857e;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        CharSequence charSequence = this.f19853a;
        byte b = this.f19854b;
        if (b != 0) {
            return b == 1;
        }
        if (this.f19857e < 0) {
            this.f19854b = (byte) 2;
            return false;
        }
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.f19855c; i3 < length2; i3++) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i3 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i3;
                this.f19854b = (byte) 1;
                this.f19857e = i;
                this.f19856d = length;
                return true;
            }
        }
        i = -1;
        this.f19854b = (byte) 1;
        this.f19857e = i;
        this.f19856d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        this.f19854b = (byte) 0;
        int i = this.f19856d;
        int i2 = this.f19855c;
        this.f19855c = this.f19857e + i;
        return this.f19853a.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
