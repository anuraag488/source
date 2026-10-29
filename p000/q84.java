package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q84 extends AbstractC0003a2 {

    /* JADX INFO: renamed from: b */
    public static final q84 f28304b = new q84(new Object[0]);

    /* JADX INFO: renamed from: a */
    public final Object[] f28305a;

    public q84(Object[] objArr) {
        this.f28305a = objArr;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        return this.f28305a.length;
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: b */
    public final AbstractC0003a2 mo17b(int i, Object obj) {
        Object[] objArr = this.f28305a;
        gq6.m6088m(i, objArr.length);
        if (i == objArr.length) {
            return mo18c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC0990oo.m9201V(0, i, 6, objArr, objArr2);
            AbstractC0990oo.m9198S(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new q84(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC0990oo.m9198S(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new ta3(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: c */
    public final AbstractC0003a2 mo18c(Object obj) {
        Object[] objArr = this.f28305a;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new q84(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new ta3(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: d */
    public final AbstractC0003a2 mo19d(Collection collection) {
        Object[] objArr = this.f28305a;
        if (collection.size() + objArr.length > 32) {
            ua3 ua3VarMo20e = mo20e();
            ua3VarMo20e.addAll(collection);
            return ua3VarMo20e.m11354c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new q84(objArrCopyOf);
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: e */
    public final ua3 mo20e() {
        return new ua3(this, null, this.f28305a, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.f28305a;
        gq6.m6087l(i, objArr.length);
        return objArr[i];
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC0990oo.m9210e0(obj, this.f28305a);
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: l */
    public final AbstractC0003a2 mo21l(C1389z1 c1389z1) {
        Object[] objArr = this.f28305a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c1389z1.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f28304b : new q84(AbstractC0990oo.m9205Z(objArrCopyOf, 0, length));
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f28305a;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f28305a;
        gq6.m6088m(i, objArr.length);
        x30 x30Var = new x30(i, objArr.length, (byte) 0);
        x30Var.f33952d = objArr;
        VarHandle.storeStoreFence();
        return x30Var;
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: m */
    public final AbstractC0003a2 mo22m(int i) {
        Object[] objArr = this.f28305a;
        gq6.m6087l(i, objArr.length);
        if (objArr.length == 1) {
            return f28304b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC0990oo.m9198S(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new q84(objArrCopyOf);
    }

    @Override // p000.AbstractC0003a2
    /* JADX INFO: renamed from: q */
    public final AbstractC0003a2 mo23q(int i, Object obj) {
        Object[] objArr = this.f28305a;
        gq6.m6087l(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new q84(objArrCopyOf);
    }
}
