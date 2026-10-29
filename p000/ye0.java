package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ye0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j */
    public static final Object f35149j = new Object();

    /* JADX INFO: renamed from: a */
    public transient Object f35150a;

    /* JADX INFO: renamed from: b */
    public transient int[] f35151b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f35152c;

    /* JADX INFO: renamed from: d */
    public transient Object[] f35153d;

    /* JADX INFO: renamed from: e */
    public transient int f35154e;

    /* JADX INFO: renamed from: f */
    public transient int f35155f;

    /* JADX INFO: renamed from: g */
    public transient ve0 f35156g;

    /* JADX INFO: renamed from: h */
    public transient ve0 f35157h;

    /* JADX INFO: renamed from: i */
    public transient xe0 f35158i;

    /* JADX INFO: renamed from: a */
    public static ye0 m13098a() {
        ye0 ye0Var = new ye0();
        ye0Var.f35154e = C0638f5.m5536g(3, 1);
        return ye0Var;
    }

    /* JADX INFO: renamed from: b */
    public final Map m13099b() {
        Object obj = this.f35150a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m13100c() {
        return (1 << (this.f35154e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m13103f()) {
            return;
        }
        this.f35154e += 32;
        Map mapM13099b = m13099b();
        if (mapM13099b != null) {
            this.f35154e = C0638f5.m5536g(size(), 3);
            mapM13099b.clear();
            this.f35150a = null;
            this.f35155f = 0;
            return;
        }
        Arrays.fill(m13106j(), 0, this.f35155f, (Object) null);
        Arrays.fill(m13107k(), 0, this.f35155f, (Object) null);
        Object obj = this.f35150a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m13105i(), 0, this.f35155f, 0);
        this.f35155f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM13099b = m13099b();
        if (mapM13099b != null) {
            return mapM13099b.containsKey(obj);
        }
        return m13101d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM13099b = m13099b();
        if (mapM13099b != null) {
            return mapM13099b.containsValue(obj);
        }
        for (int i = 0; i < this.f35155f; i++) {
            if (qs5.m10116u(obj, m13107k()[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m13101d(Object obj) {
        if (m13103f()) {
            return -1;
        }
        int iM7372F = k43.m7372F(obj);
        int iM13100c = m13100c();
        Object obj2 = this.f35150a;
        Objects.requireNonNull(obj2);
        int iM10715c0 = se0.m10715c0(iM7372F & iM13100c, obj2);
        if (iM10715c0 == 0) {
            return -1;
        }
        int i = ~iM13100c;
        int i2 = iM7372F & i;
        do {
            int i3 = iM10715c0 - 1;
            int i4 = m13105i()[i3];
            if ((i4 & i) == i2 && qs5.m10116u(obj, m13106j()[i3])) {
                return i3;
            }
            iM10715c0 = i4 & iM13100c;
        } while (iM10715c0 != 0);
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m13102e(int i, int i2) {
        Object obj = this.f35150a;
        Objects.requireNonNull(obj);
        int[] iArrM13105i = m13105i();
        Object[] objArrM13106j = m13106j();
        Object[] objArrM13107k = m13107k();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM13106j[i] = null;
            objArrM13107k[i] = null;
            iArrM13105i[i] = 0;
            return;
        }
        Object obj2 = objArrM13106j[i3];
        objArrM13106j[i] = obj2;
        objArrM13107k[i] = objArrM13107k[i3];
        objArrM13106j[i3] = null;
        objArrM13107k[i3] = null;
        iArrM13105i[i] = iArrM13105i[i3];
        iArrM13105i[i3] = 0;
        int iM7372F = k43.m7372F(obj2) & i2;
        int iM10715c0 = se0.m10715c0(iM7372F, obj);
        if (iM10715c0 == size) {
            se0.m10717d0(iM7372F, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iM10715c0 - 1;
            int i5 = iArrM13105i[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrM13105i[i4] = se0.m10699L(i5, i + 1, i2);
                return;
            }
            iM10715c0 = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ve0 ve0Var = this.f35157h;
        if (ve0Var != null) {
            return ve0Var;
        }
        ve0 ve0Var2 = new ve0(this, (byte) 0);
        this.f35157h = ve0Var2;
        return ve0Var2;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13103f() {
        return this.f35150a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM13099b = m13099b();
        if (mapM13099b != null) {
            return mapM13099b.get(obj);
        }
        int iM13101d = m13101d(obj);
        if (iM13101d == -1) {
            return null;
        }
        return m13107k()[iM13101d];
    }

    /* JADX INFO: renamed from: h */
    public final Object m13104h(Object obj) {
        if (!m13103f()) {
            int iM13100c = m13100c();
            Object obj2 = this.f35150a;
            Objects.requireNonNull(obj2);
            int iM10707V = se0.m10707V(obj, null, iM13100c, obj2, m13105i(), m13106j(), null);
            if (iM10707V != -1) {
                Object obj3 = m13107k()[iM10707V];
                m13102e(iM10707V, iM13100c);
                this.f35155f--;
                this.f35154e += 32;
                return obj3;
            }
        }
        return f35149j;
    }

    /* JADX INFO: renamed from: i */
    public final int[] m13105i() {
        int[] iArr = this.f35151b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object[] m13106j() {
        Object[] objArr = this.f35152c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: k */
    public final Object[] m13107k() {
        Object[] objArr = this.f35153d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ve0 ve0Var = this.f35156g;
        if (ve0Var != null) {
            return ve0Var;
        }
        ve0 ve0Var2 = new ve0(this, (byte) 1);
        this.f35156g = ve0Var2;
        return ve0Var2;
    }

    /* JADX INFO: renamed from: l */
    public final int m13108l(int i, int i2, int i3, int i4) {
        Object objM10735p = se0.m10735p(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            se0.m10717d0(i3 & i5, i4 + 1, objM10735p);
        }
        Object obj = this.f35150a;
        Objects.requireNonNull(obj);
        int[] iArrM13105i = m13105i();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM10715c0 = se0.m10715c0(i6, obj);
            while (iM10715c0 != 0) {
                int i7 = iM10715c0 - 1;
                int i8 = iArrM13105i[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM10715c1 = se0.m10715c0(i10, objM10735p);
                se0.m10717d0(i10, iM10715c0, objM10735p);
                iArrM13105i[i7] = se0.m10699L(i9, iM10715c1, i5);
                iM10715c0 = i8 & i;
            }
        }
        this.f35150a = objM10735p;
        this.f35154e = se0.m10699L(this.f35154e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d7 -> B:28:0x00bf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:26:0x00ab
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ye0.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM13099b = m13099b();
        if (mapM13099b != null) {
            return mapM13099b.remove(obj);
        }
        Object objM13104h = m13104h(obj);
        if (objM13104h == f35149j) {
            return null;
        }
        return objM13104h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM13099b = m13099b();
        return mapM13099b != null ? mapM13099b.size() : this.f35155f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        xe0 xe0Var = this.f35158i;
        if (xe0Var != null) {
            return xe0Var;
        }
        xe0 xe0Var2 = new xe0(this);
        this.f35158i = xe0Var2;
        return xe0Var2;
    }
}
