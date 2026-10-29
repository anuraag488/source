package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hq2 extends AbstractC1129s1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20782a;

    /* JADX INFO: renamed from: b */
    public Object f20783b;

    public /* synthetic */ hq2(byte b) {
        this.f20782a = b;
    }

    @Override // p000.AbstractC0929n0
    /* JADX INFO: renamed from: a */
    public final int mo103a() {
        switch (this.f20782a) {
            case 0:
                return ((Matcher) ((C1283w7) this.f20783b).f33127c).groupCount() + 1;
            default:
                return ((List) this.f20783b).size();
        }
    }

    @Override // p000.AbstractC0929n0, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f20782a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f20782a) {
            case 0:
                String strGroup = ((Matcher) ((C1283w7) this.f20783b).f33127c).group(i);
                return strGroup == null ? "" : strGroup;
            default:
                List list = (List) this.f20783b;
                if (i >= 0 && i <= kx5.m7689T(this)) {
                    return list.get(kx5.m7689T(this) - i);
                }
                StringBuilder sbM3883o = c75.m3883o("Element index ", i, " must be in range [");
                sbM3883o.append(new r52(0, kx5.m7689T(this), 1));
                sbM3883o.append("].");
                throw new IndexOutOfBoundsException(sbM3883o.toString());
        }
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f20782a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p000.AbstractC1129s1, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f20782a) {
            case 1:
                return listIterator(0);
            default:
                return super.iterator();
        }
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f20782a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f20782a) {
            case 1:
                kp3 kp3Var = new kp3((byte) 0);
                kp3Var.f23332c = this;
                List list = (List) this.f20783b;
                if (i >= 0 && i <= mo103a()) {
                    kp3Var.f23331b = list.listIterator(mo103a() - i);
                    VarHandle.storeStoreFence();
                    return kp3Var;
                }
                StringBuilder sbM3883o = c75.m3883o("Position index ", i, " must be in range [");
                sbM3883o.append(new r52(0, mo103a(), 1));
                sbM3883o.append("].");
                throw new IndexOutOfBoundsException(sbM3883o.toString());
            default:
                return super.listIterator(i);
        }
    }

    @Override // p000.AbstractC1129s1, java.util.List
    public ListIterator listIterator() {
        switch (this.f20782a) {
            case 1:
                return listIterator(0);
            default:
                return super.listIterator();
        }
    }
}
