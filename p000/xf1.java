package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class xf1 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34221a;

    /* JADX INFO: renamed from: b */
    public Object f34222b;

    /* JADX INFO: renamed from: c */
    public int f34223c;

    /* JADX INFO: renamed from: d */
    public Object f34224d;

    public xf1(Object obj, Map map) {
        this.f34221a = (byte) 4;
        this.f34222b = obj;
        this.f34224d = map;
    }

    /* JADX INFO: renamed from: a */
    public void m12684a() {
        Object next;
        String str;
        Iterator it = (Iterator) this.f34224d;
        do {
            if (!it.hasNext()) {
                this.f34223c = 0;
                return;
            } else {
                next = it.next();
                str = (String) next;
            }
        } while (!(!(str == null || str.length() == 0)));
        this.f34222b = next;
        this.f34223c = 1;
    }

    /* JADX INFO: renamed from: b */
    public void m12685b() {
        int i = this.f34223c;
        xr1 xr1Var = (xr1) this.f34224d;
        Object objInvoke = i == -2 ? ((wp1) xr1Var.f34562c).invoke() : xr1Var.f34561b.invoke(this.f34222b);
        this.f34222b = objInvoke;
        this.f34223c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f34221a) {
            case 0:
                if (this.f34223c == -1) {
                    m12684a();
                }
                return this.f34223c == 1;
            case 1:
                if (this.f34223c < 0) {
                    m12685b();
                }
                return this.f34223c == 1;
            case 2:
                return ((b24) this.f34224d).hasNext();
            case 3:
                return ((b24) this.f34224d).hasNext();
            default:
                return this.f34223c < ((Map) this.f34224d).size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = null;
        switch (this.f34221a) {
            case 0:
                if (this.f34223c == -1) {
                    m12684a();
                }
                if (this.f34223c == 0) {
                    xy4.m12795x();
                    return null;
                }
                Object obj2 = this.f34222b;
                this.f34222b = null;
                this.f34223c = -1;
                return obj2;
            case 1:
                if (this.f34223c < 0) {
                    m12685b();
                }
                if (this.f34223c == 0) {
                    xy4.m12795x();
                    return null;
                }
                Object obj3 = this.f34222b;
                this.f34223c = -1;
                return obj3;
            case 2:
                return ((b24) this.f34224d).next();
            case 3:
                return ((b24) this.f34224d).next();
            default:
                if (hasNext()) {
                    obj = this.f34222b;
                    this.f34223c++;
                    Object obj4 = ((Map) this.f34224d).get(obj);
                    if (obj4 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.f34222b = ((ql2) obj4).f28554b;
                } else {
                    xy4.m12795x();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f34221a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i = this.f34223c;
                if (i != -1) {
                    ((fw2) this.f34222b).f19355b.m4781i(i);
                    this.f34223c = -1;
                    return;
                }
                return;
            case 3:
                int i2 = this.f34223c;
                if (i2 != -1) {
                    ((pw2) this.f34222b).f28049b.m8421m(i2);
                    this.f34223c = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ xf1(byte b) {
        this.f34221a = b;
    }
}
