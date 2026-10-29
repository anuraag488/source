package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class km3 extends x12 {

    /* JADX INFO: renamed from: i */
    public static final Object[] f23234i;

    /* JADX INFO: renamed from: j */
    public static final km3 f23235j;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f23236d;

    /* JADX INFO: renamed from: e */
    public final transient int f23237e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f23238f;

    /* JADX INFO: renamed from: g */
    public final transient int f23239g;

    /* JADX INFO: renamed from: h */
    public final transient int f23240h;

    static {
        Object[] objArr = new Object[0];
        f23234i = objArr;
        f23235j = new km3(0, 0, 0, objArr, objArr);
    }

    public km3(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f23236d = objArr;
        this.f23237e = i;
        this.f23238f = objArr2;
        this.f23239g = i2;
        this.f23240h = i3;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: b */
    public final int mo5199b(Object[] objArr) {
        Object[] objArr2 = this.f23236d;
        int i = this.f23240h;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: c */
    public final Object[] mo5200c() {
        return this.f23236d;
    }

    @Override // p000.o12, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f23238f;
        if (objArr.length == 0) {
            return false;
        }
        int iM7372F = k43.m7372F(obj);
        while (true) {
            int i = iM7372F & this.f23239g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM7372F = i + 1;
        }
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: d */
    public final int mo5201d() {
        return this.f23240h;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: e */
    public final int mo5202e() {
        return 0;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: g */
    public final boolean mo5203g() {
        return false;
    }

    @Override // p000.x12, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f23237e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ru4 iterator() {
        return mo6445a().listIterator(0);
    }

    @Override // p000.x12
    /* JADX INFO: renamed from: r */
    public final u12 mo6039r() {
        return u12.m11199m(this.f23240h, this.f23236d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23240h;
    }
}
