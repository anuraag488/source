package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v06 extends p06 {

    /* JADX INFO: renamed from: k */
    public static final Object[] f32294k;

    /* JADX INFO: renamed from: l */
    public static final v06 f32295l;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f32296f;

    /* JADX INFO: renamed from: g */
    public final transient int f32297g;

    /* JADX INFO: renamed from: h */
    public final transient Object[] f32298h;

    /* JADX INFO: renamed from: i */
    public final transient int f32299i;

    /* JADX INFO: renamed from: j */
    public final transient int f32300j;

    static {
        Object[] objArr = new Object[0];
        f32294k = objArr;
        f32295l = new v06(0, 0, 0, objArr, objArr);
    }

    public v06(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super((byte) 1);
        this.f32296f = objArr;
        this.f32297g = i;
        this.f32298h = objArr2;
        this.f32299i = i2;
        this.f32300j = i3;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: a */
    public final int mo5884a(Object[] objArr) {
        Object[] objArr2 = this.f32296f;
        int i = this.f32300j;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: b */
    public final int mo7790b() {
        return this.f32300j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f32298h;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.f32299i;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: d */
    public final int mo5776d() {
        return 0;
    }

    @Override // p000.qn5
    /* JADX INFO: renamed from: g */
    public final Object[] mo7791g() {
        return this.f32296f;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32297g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        n06 s06Var = this.f27267d;
        if (s06Var == null) {
            j06 j06Var = n06.f25371d;
            int i = this.f32300j;
            s06Var = i == 0 ? s06.f29800g : new s06(i, this.f32296f);
            this.f27267d = s06Var;
        }
        return s06Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f32300j;
    }
}
