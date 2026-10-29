package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g50 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19615a;

    /* JADX INFO: renamed from: b */
    public int f19616b;

    /* JADX INFO: renamed from: c */
    public int f19617c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19618d;

    public /* synthetic */ g50(byte b) {
        this.f19615a = b;
    }

    /* JADX INFO: renamed from: a */
    public byte m5904a() {
        switch (this.f19615a) {
            case 0:
                int i = this.f19616b;
                if (i < this.f19617c) {
                    this.f19616b = i + 1;
                    return ((t50) this.f19618d).mo7015g(i);
                }
                xy4.m12795x();
                return (byte) 0;
            default:
                int i2 = this.f19616b;
                if (i2 < this.f19617c) {
                    this.f19616b = i2 + 1;
                    return ((n50) this.f19618d).mo7403e(i2);
                }
                xy4.m12795x();
                return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19615a) {
            case 0:
                return this.f19616b < this.f19617c;
            case 1:
                return this.f19616b < this.f19617c;
            case 2:
                return this.f19616b < this.f19617c;
            case 3:
                return this.f19616b < this.f19617c;
            case 4:
                return this.f19616b < this.f19617c;
            default:
                return this.f19616b < this.f19617c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19615a) {
            case 0:
                return Byte.valueOf(m5904a());
            case 1:
                return Byte.valueOf(m5904a());
            case 2:
                int i = this.f19616b;
                if (i < this.f19617c) {
                    this.f19616b = i + 1;
                    return Byte.valueOf(((r46) this.f19618d).mo8517b(i));
                }
                xy4.m12795x();
                return null;
            case 3:
                int i2 = this.f19616b;
                if (i2 < this.f19617c) {
                    this.f19616b = i2 + 1;
                    return Byte.valueOf(((aj6) this.f19618d).mo3013b(i2));
                }
                xy4.m12795x();
                return null;
            case 4:
                int i3 = this.f19616b;
                if (i3 < this.f19617c) {
                    this.f19616b = i3 + 1;
                    return Byte.valueOf(((ig6) this.f19618d).mo3592c(i3));
                }
                xy4.m12795x();
                return null;
            default:
                int i4 = this.f19616b;
                if (i4 < this.f19617c) {
                    this.f19616b = i4 + 1;
                    return Byte.valueOf(((ym6) this.f19618d).mo11066c(i4));
                }
                xy4.m12795x();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f19615a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
