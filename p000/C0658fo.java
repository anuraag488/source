package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: fo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0658fo implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public int f19156a;

    /* JADX INFO: renamed from: b */
    public int f19157b;

    /* JADX INFO: renamed from: c */
    public boolean f19158c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ byte f19159d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f19160e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0658fo(C0805jo c0805jo, byte b) {
        this(c0805jo.f34030c);
        this.f19159d = b;
        switch (b) {
            case 1:
                this.f19160e = c0805jo;
                this(c0805jo.f34030c);
                break;
            default:
                this.f19160e = c0805jo;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19157b < this.f19156a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM12500e;
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        int i = this.f19157b;
        byte b = this.f19159d;
        Object obj = this.f19160e;
        switch (b) {
            case 0:
                objM12500e = ((C0805jo) obj).m12500e(i);
                break;
            case 1:
                objM12500e = ((C0805jo) obj).m12503i(i);
                break;
            default:
                objM12500e = ((C0879lo) obj).f24218b[i];
                break;
        }
        this.f19157b++;
        this.f19158c = true;
        return objM12500e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19158c) {
            C1077qn.m9989o("Call next() before removing an element.");
            return;
        }
        int i = this.f19157b - 1;
        this.f19157b = i;
        byte b = this.f19159d;
        Object obj = this.f19160e;
        switch (b) {
            case 0:
                ((C0805jo) obj).m12501f(i);
                break;
            case 1:
                ((C0805jo) obj).m12501f(i);
                break;
            default:
                ((C0879lo) obj).m8043b(i);
                break;
        }
        this.f19156a--;
        this.f19158c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0658fo(C0879lo c0879lo) {
        this(c0879lo.f24219c);
        this.f19159d = (byte) 2;
        this.f19160e = c0879lo;
    }

    public C0658fo(int i) {
        this.f19156a = i;
    }
}
