package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hy0 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public int f20930a;

    /* JADX INFO: renamed from: b */
    public int f20931b;

    /* JADX INFO: renamed from: c */
    public int f20932c;

    /* JADX INFO: renamed from: d */
    public r52 f20933d;

    /* JADX INFO: renamed from: e */
    public int f20934e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ iy0 f20935f;

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX INFO: renamed from: a */
    public final void m6531a() {
        l73 l73Var;
        iy0 iy0Var = this.f20935f;
        CharSequence charSequence = (CharSequence) iy0Var.f21873c;
        int i = this.f20932c;
        if (i < 0) {
            this.f20930a = 0;
            this.f20933d = null;
            return;
        }
        int i2 = iy0Var.f21872b;
        if (i2 > 0) {
            int i3 = this.f20934e + 1;
            this.f20934e = i3;
            if (i3 >= i2) {
                this.f20933d = new r52(this.f20931b, hd4.m6339e0(charSequence), 1);
                this.f20932c = -1;
            } else if (i > charSequence.length() && (l73Var = (l73) ((mq1) iy0Var.f21874d).invoke(charSequence, Integer.valueOf(this.f20932c))) != null) {
                int iIntValue = ((Number) l73Var.f23833a).intValue();
                int iIntValue2 = ((Number) l73Var.f23834b).intValue();
                this.f20933d = sc6.m10660c0(this.f20931b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f20931b = i4;
                this.f20932c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f20933d = new r52(this.f20931b, hd4.m6339e0(charSequence), 1);
                this.f20932c = -1;
            }
        } else if (i > charSequence.length()) {
            this.f20933d = new r52(this.f20931b, hd4.m6339e0(charSequence), 1);
            this.f20932c = -1;
        } else {
            int iIntValue3 = ((Number) l73Var.f23833a).intValue();
            int iIntValue4 = ((Number) l73Var.f23834b).intValue();
            this.f20933d = sc6.m10660c0(this.f20931b, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.f20931b = i5;
            this.f20932c = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f20930a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20930a == -1) {
            m6531a();
        }
        return this.f20930a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20930a == -1) {
            m6531a();
        }
        if (this.f20930a == 0) {
            xy4.m12795x();
            return null;
        }
        r52 r52Var = this.f20933d;
        this.f20933d = null;
        this.f20930a = -1;
        return r52Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
