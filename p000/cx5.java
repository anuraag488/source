package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cx5 extends bw5 {

    /* JADX INFO: renamed from: i */
    public static final Object[] f16586i;

    /* JADX INFO: renamed from: j */
    public static final cx5 f16587j;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f16588d;

    /* JADX INFO: renamed from: e */
    public final transient int f16589e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f16590f;

    /* JADX INFO: renamed from: g */
    public final transient int f16591g;

    /* JADX INFO: renamed from: h */
    public final transient int f16592h;

    static {
        Object[] objArr = new Object[0];
        f16586i = objArr;
        f16587j = new cx5(0, 0, 0, objArr, objArr);
    }

    public cx5(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f16588d = objArr;
        this.f16589e = i;
        this.f16590f = objArr2;
        this.f16591g = i2;
        this.f16592h = i3;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: a */
    public final int mo4228a(Object[] objArr) {
        Object[] objArr2 = this.f16588d;
        int i = this.f16592h;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: b */
    public final int mo4229b() {
        return this.f16592h;
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: c */
    public final int mo4230c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f16590f;
        if (objArr.length == 0) {
            return false;
        }
        int iM8113a = lu5.m8113a(obj.hashCode());
        while (true) {
            int i = iM8113a & this.f16591g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM8113a = i + 1;
        }
    }

    @Override // p000.su5
    /* JADX INFO: renamed from: g */
    public final Object[] mo4231g() {
        return this.f16588d;
    }

    @Override // p000.bw5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f16589e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo3751d().listIterator(0);
    }

    @Override // p000.bw5
    /* JADX INFO: renamed from: m */
    public final sv5 mo3752m() {
        return sv5.m10928m(this.f16592h, this.f16588d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16592h;
    }
}
