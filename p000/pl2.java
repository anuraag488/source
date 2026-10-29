package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pl2 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final vl1 f27727i = new vl1(14);

    /* JADX INFO: renamed from: b */
    public final boolean f27729b;

    /* JADX INFO: renamed from: c */
    public ol2 f27730c;

    /* JADX INFO: renamed from: f */
    public final ol2 f27733f;

    /* JADX INFO: renamed from: g */
    public nl2 f27734g;

    /* JADX INFO: renamed from: h */
    public nl2 f27735h;

    /* JADX INFO: renamed from: d */
    public int f27731d = 0;

    /* JADX INFO: renamed from: e */
    public int f27732e = 0;

    /* JADX INFO: renamed from: a */
    public final Comparator f27728a = f27727i;

    public pl2(boolean z) {
        this.f27729b = z;
        ol2 ol2Var = new ol2();
        ol2Var.f26847f = null;
        ol2Var.f26848g = z;
        ol2Var.f26846e = ol2Var;
        ol2Var.f26845d = ol2Var;
        VarHandle.storeStoreFence();
        this.f27733f = ol2Var;
    }

    /* JADX INFO: renamed from: a */
    public final ol2 m9561a(Object obj, boolean z) {
        int iCompareTo;
        ol2 ol2Var;
        ol2 ol2Var2 = this.f27730c;
        vl1 vl1Var = f27727i;
        Comparator comparator = this.f27728a;
        if (ol2Var2 != null) {
            Comparable comparable = comparator == vl1Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = ol2Var2.f26847f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return ol2Var2;
                }
                ol2 ol2Var3 = iCompareTo < 0 ? ol2Var2.f26843b : ol2Var2.f26844c;
                if (ol2Var3 == null) {
                    break;
                }
                ol2Var2 = ol2Var3;
            }
        } else {
            iCompareTo = 0;
        }
        ol2 ol2Var4 = ol2Var2;
        if (!z) {
            return null;
        }
        ol2 ol2Var5 = this.f27733f;
        if (ol2Var4 != null) {
            ol2Var = new ol2(this.f27729b, ol2Var4, obj, ol2Var5, ol2Var5.f26846e);
            if (iCompareTo < 0) {
                ol2Var4.f26843b = ol2Var;
            } else {
                ol2Var4.f26844c = ol2Var;
            }
            m9562b(ol2Var4, true);
        } else {
            if (comparator == vl1Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            ol2Var = new ol2(this.f27729b, ol2Var4, obj, ol2Var5, ol2Var5.f26846e);
            this.f27730c = ol2Var;
        }
        this.f27731d++;
        this.f27732e++;
        return ol2Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m9562b(ol2 ol2Var, boolean z) {
        while (ol2Var != null) {
            ol2 ol2Var2 = ol2Var.f26843b;
            ol2 ol2Var3 = ol2Var.f26844c;
            int i = ol2Var2 != null ? ol2Var2.f26850i : 0;
            int i2 = ol2Var3 != null ? ol2Var3.f26850i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                ol2 ol2Var4 = ol2Var3.f26843b;
                ol2 ol2Var5 = ol2Var3.f26844c;
                int i4 = (ol2Var4 != null ? ol2Var4.f26850i : 0) - (ol2Var5 != null ? ol2Var5.f26850i : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m9565e(ol2Var);
                } else {
                    m9566f(ol2Var3);
                    m9565e(ol2Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                ol2 ol2Var6 = ol2Var2.f26843b;
                ol2 ol2Var7 = ol2Var2.f26844c;
                int i5 = (ol2Var6 != null ? ol2Var6.f26850i : 0) - (ol2Var7 != null ? ol2Var7.f26850i : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m9566f(ol2Var);
                } else {
                    m9565e(ol2Var2);
                    m9566f(ol2Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                ol2Var.f26850i = i + 1;
                if (z) {
                    return;
                }
            } else {
                ol2Var.f26850i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            ol2Var = ol2Var.f26842a;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9563c(ol2 ol2Var, boolean z) {
        ol2 ol2Var2;
        ol2 ol2Var3;
        int i;
        if (z) {
            ol2 ol2Var4 = ol2Var.f26846e;
            ol2Var4.f26845d = ol2Var.f26845d;
            ol2Var.f26845d.f26846e = ol2Var4;
        }
        ol2 ol2Var5 = ol2Var.f26843b;
        ol2 ol2Var6 = ol2Var.f26844c;
        ol2 ol2Var7 = ol2Var.f26842a;
        int i2 = 0;
        if (ol2Var5 == null || ol2Var6 == null) {
            if (ol2Var5 != null) {
                m9564d(ol2Var, ol2Var5);
                ol2Var.f26843b = null;
            } else if (ol2Var6 != null) {
                m9564d(ol2Var, ol2Var6);
                ol2Var.f26844c = null;
            } else {
                m9564d(ol2Var, null);
            }
            m9562b(ol2Var7, false);
            this.f27731d--;
            this.f27732e++;
            return;
        }
        if (ol2Var5.f26850i > ol2Var6.f26850i) {
            ol2 ol2Var8 = ol2Var5.f26844c;
            while (true) {
                ol2 ol2Var9 = ol2Var8;
                ol2Var3 = ol2Var5;
                ol2Var5 = ol2Var9;
                if (ol2Var5 == null) {
                    break;
                } else {
                    ol2Var8 = ol2Var5.f26844c;
                }
            }
        } else {
            ol2 ol2Var10 = ol2Var6.f26843b;
            while (true) {
                ol2Var2 = ol2Var6;
                ol2Var6 = ol2Var10;
                if (ol2Var6 == null) {
                    break;
                } else {
                    ol2Var10 = ol2Var6.f26843b;
                }
            }
            ol2Var3 = ol2Var2;
        }
        m9563c(ol2Var3, false);
        ol2 ol2Var11 = ol2Var.f26843b;
        if (ol2Var11 != null) {
            i = ol2Var11.f26850i;
            ol2Var3.f26843b = ol2Var11;
            ol2Var11.f26842a = ol2Var3;
            ol2Var.f26843b = null;
        } else {
            i = 0;
        }
        ol2 ol2Var12 = ol2Var.f26844c;
        if (ol2Var12 != null) {
            i2 = ol2Var12.f26850i;
            ol2Var3.f26844c = ol2Var12;
            ol2Var12.f26842a = ol2Var3;
            ol2Var.f26844c = null;
        }
        ol2Var3.f26850i = Math.max(i, i2) + 1;
        m9564d(ol2Var, ol2Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f27730c = null;
        this.f27731d = 0;
        this.f27732e++;
        ol2 ol2Var = this.f27733f;
        ol2Var.f26846e = ol2Var;
        ol2Var.f26845d = ol2Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        ol2 ol2VarM9561a = null;
        if (obj != null) {
            try {
                ol2VarM9561a = m9561a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return ol2VarM9561a != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m9564d(ol2 ol2Var, ol2 ol2Var2) {
        ol2 ol2Var3 = ol2Var.f26842a;
        ol2Var.f26842a = null;
        if (ol2Var2 != null) {
            ol2Var2.f26842a = ol2Var3;
        }
        if (ol2Var3 == null) {
            this.f27730c = ol2Var2;
        } else if (ol2Var3.f26843b == ol2Var) {
            ol2Var3.f26843b = ol2Var2;
        } else {
            ol2Var3.f26844c = ol2Var2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9565e(ol2 ol2Var) {
        ol2 ol2Var2 = ol2Var.f26843b;
        ol2 ol2Var3 = ol2Var.f26844c;
        ol2 ol2Var4 = ol2Var3.f26843b;
        ol2 ol2Var5 = ol2Var3.f26844c;
        ol2Var.f26844c = ol2Var4;
        if (ol2Var4 != null) {
            ol2Var4.f26842a = ol2Var;
        }
        m9564d(ol2Var, ol2Var3);
        ol2Var3.f26843b = ol2Var;
        ol2Var.f26842a = ol2Var3;
        int iMax = Math.max(ol2Var2 != null ? ol2Var2.f26850i : 0, ol2Var4 != null ? ol2Var4.f26850i : 0) + 1;
        ol2Var.f26850i = iMax;
        ol2Var3.f26850i = Math.max(iMax, ol2Var5 != null ? ol2Var5.f26850i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        nl2 nl2Var = this.f27734g;
        if (nl2Var != null) {
            return nl2Var;
        }
        nl2 nl2Var2 = new nl2(this, (byte) 0);
        this.f27734g = nl2Var2;
        return nl2Var2;
    }

    /* JADX INFO: renamed from: f */
    public final void m9566f(ol2 ol2Var) {
        ol2 ol2Var2 = ol2Var.f26843b;
        ol2 ol2Var3 = ol2Var.f26844c;
        ol2 ol2Var4 = ol2Var2.f26843b;
        ol2 ol2Var5 = ol2Var2.f26844c;
        ol2Var.f26843b = ol2Var5;
        if (ol2Var5 != null) {
            ol2Var5.f26842a = ol2Var;
        }
        m9564d(ol2Var, ol2Var2);
        ol2Var2.f26844c = ol2Var;
        ol2Var.f26842a = ol2Var2;
        int iMax = Math.max(ol2Var3 != null ? ol2Var3.f26850i : 0, ol2Var5 != null ? ol2Var5.f26850i : 0) + 1;
        ol2Var.f26850i = iMax;
        ol2Var2.f26850i = Math.max(iMax, ol2Var4 != null ? ol2Var4.f26850i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        ol2 ol2VarM9561a;
        if (obj != null) {
            try {
                ol2VarM9561a = m9561a(obj, false);
            } catch (ClassCastException unused) {
                ol2VarM9561a = null;
            }
        } else {
            ol2VarM9561a = null;
        }
        if (ol2VarM9561a != null) {
            return ol2VarM9561a.f26849h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        nl2 nl2Var = this.f27735h;
        if (nl2Var != null) {
            return nl2Var;
        }
        nl2 nl2Var2 = new nl2(this, (byte) 1);
        this.f27735h = nl2Var2;
        return nl2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            xy4.m12782k("key == null");
            return null;
        }
        if (obj2 == null && !this.f27729b) {
            xy4.m12782k("value == null");
            return null;
        }
        ol2 ol2VarM9561a = m9561a(obj, true);
        Object obj3 = ol2VarM9561a.f26849h;
        ol2VarM9561a.f26849h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        ol2 ol2VarM9561a;
        if (obj != null) {
            try {
                ol2VarM9561a = m9561a(obj, false);
            } catch (ClassCastException unused) {
                ol2VarM9561a = null;
            }
        } else {
            ol2VarM9561a = null;
        }
        if (ol2VarM9561a != null) {
            m9563c(ol2VarM9561a, true);
        }
        if (ol2VarM9561a != null) {
            return ol2VarM9561a.f26849h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f27731d;
    }
}
