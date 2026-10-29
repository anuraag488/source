package p000;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yu2 {

    /* JADX INFO: renamed from: a */
    public final C1122rv f35532a;

    /* JADX INFO: renamed from: b */
    public final int f35533b;

    /* JADX INFO: renamed from: c */
    public final boolean f35534c;

    /* JADX INFO: renamed from: d */
    public final float f35535d;

    /* JADX INFO: renamed from: e */
    public final float f35536e;

    /* JADX INFO: renamed from: f */
    public final int f35537f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f35538g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f35539h;

    public yu2(C1122rv c1122rv, long j, int i, int i2) {
        boolean z;
        int iM7538h;
        this.f35532a = c1122rv;
        this.f35533b = i;
        if (kl0.m7541k(j) != 0 || kl0.m7540j(j) != 0) {
            r32.m10186a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c1122rv.f29655f;
        int size = arrayList2.size();
        float f = 0.0f;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= size) {
                z = false;
                break;
            }
            o73 o73Var = (o73) arrayList2.get(i3);
            C0452af c0452af = o73Var.f26411a;
            int iM7539i = kl0.m7539i(j);
            if (kl0.m7534d(j)) {
                iM7538h = kl0.m7538h(j) - ((int) Math.ceil(f));
                if (iM7538h < 0) {
                    iM7538h = 0;
                }
            } else {
                iM7538h = kl0.m7538h(j);
            }
            C1328xe c1328xeM7704e = kx5.m7704e(c0452af, ll0.m8010b(0, iM7539i, 0, iM7538h, 5), this.f35533b - i4, i2);
            hl4 hl4Var = c1328xeM7704e.f34185c;
            float f2 = c1328xeM7704e.f34187e + f;
            int i5 = hl4Var.f20680g + i4;
            int i6 = o73Var.f26412b;
            int i7 = o73Var.f26413c;
            n73 n73Var = new n73();
            n73Var.f25497a = c1328xeM7704e;
            n73Var.f25498b = i6;
            n73Var.f25499c = i7;
            n73Var.f25500d = i4;
            n73Var.f25501e = i5;
            n73Var.f25502f = f;
            n73Var.f25503g = f2;
            VarHandle.storeStoreFence();
            arrayList.add(n73Var);
            if (hl4Var.f20677d || (i5 == this.f35533b && i3 != kx5.m7689T((ArrayList) this.f35532a.f29655f))) {
                z = true;
                f = f2;
                i4 = i5;
                break;
            } else {
                i3++;
                f = f2;
                i4 = i5;
            }
        }
        this.f35536e = f;
        this.f35537f = i4;
        this.f35534c = z;
        this.f35539h = arrayList;
        this.f35535d = kl0.m7539i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            n73 n73Var2 = (n73) arrayList.get(i8);
            List list = n73Var2.f25497a.f34188f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                jl3 jl3Var = (jl3) list.get(i9);
                arrayList4.add(jl3Var != null ? n73Var2.m8569a(jl3Var) : null);
            }
            mb0.m8260A0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.f35532a.f29652c).size()) {
            int size4 = ((List) this.f35532a.f29652c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = hb0.m6310V0(arrayList3, arrayList5);
        }
        this.f35538g = arrayList3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public static void m13241i(yu2 yu2Var, h70 h70Var, t30 t30Var, float f, m44 m44Var, uj4 uj4Var, qq2 qq2Var) {
        h70Var.mo6253j();
        ArrayList arrayList = yu2Var.f35539h;
        if (arrayList.size() <= 1 || (t30Var instanceof ga4)) {
            qs5.m10115t(yu2Var, h70Var, t30Var, f, m44Var, uj4Var, qq2Var);
        } else {
            if (!(t30Var instanceof u30)) {
                C0670g.m5864c();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                C1328xe c1328xe = ((n73) arrayList.get(i)).f25497a;
                f2 += c1328xe.f34187e;
                fMax = Math.max(fMax, c1328xe.m12675c());
            }
            Float.floatToRawIntBits(fMax);
            Float.floatToRawIntBits(f2);
            Shader shader = ((u30) t30Var).f31634c;
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C1328xe c1328xe2 = ((n73) arrayList.get(i2)).f25497a;
                u30 u30Var = new u30();
                u30Var.f31634c = shader;
                u30Var.f31633b = 9205357640488583168L;
                VarHandle.storeStoreFence();
                c1328xe2.m12678f(h70Var, u30Var, f, m44Var, uj4Var, qq2Var);
                h70Var.mo6249e(0.0f, c1328xe2.f34187e);
                matrix.setTranslate(0.0f, -c1328xe2.f34187e);
                shader.setLocalMatrix(matrix);
            }
        }
        h70Var.mo6251g();
    }

    /* JADX INFO: renamed from: a */
    public final void m13242a(long j, float[] fArr) {
        m13250j(ql4.m9903g(j));
        m13251k(ql4.m9902f(j));
        ol3 ol3Var = new ol3();
        ol3Var.f26851a = 0;
        nl3 nl3Var = new nl3();
        e10 e10Var = new e10((byte) 1);
        e10Var.f17579b = j;
        e10Var.f17580c = fArr;
        e10Var.f17581d = ol3Var;
        e10Var.f17582e = nl3Var;
        VarHandle.storeStoreFence();
        ks5.m7616q(this.f35539h, j, e10Var);
    }

    /* JADX INFO: renamed from: b */
    public final float m13243b(int i) {
        m13252l(i);
        ArrayList arrayList = this.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7614o(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        return c1328xe.f34185c.m6432e(i - n73Var.f25500d) + n73Var.f25502f;
    }

    /* JADX INFO: renamed from: c */
    public final int m13244c(int i, boolean z) {
        int iM6433f;
        m13252l(i);
        ArrayList arrayList = this.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7614o(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        int i2 = i - n73Var.f25500d;
        hl4 hl4Var = c1328xe.f34185c;
        if (z) {
            Layout layout = hl4Var.f20679f;
            ThreadLocal threadLocal = ll4.f24138a;
            if (layout.getEllipsisCount(i2) <= 0 || hl4Var.f20675b != TextUtils.TruncateAt.END) {
                C1122rv c1122rvM6430c = hl4Var.m6430c();
                Layout layout2 = (Layout) c1122rvM6430c.f29651b;
                iM6433f = c1122rvM6430c.m10460s(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iM6433f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iM6433f = hl4Var.m6433f(i2);
        }
        return iM6433f + n73Var.f25498b;
    }

    /* JADX INFO: renamed from: d */
    public final int m13245d(int i) {
        int iM7613n;
        int length = ((C0875lk) this.f35532a.f29651b).f24092b.length();
        ArrayList arrayList = this.f35539h;
        if (i >= length) {
            iM7613n = kx5.m7689T(arrayList);
        } else {
            iM7613n = i < 0 ? 0 : ks5.m7613n(arrayList, i);
        }
        n73 n73Var = (n73) arrayList.get(iM7613n);
        return n73Var.f25497a.f34185c.m6434g(n73Var.m8572d(i)) + n73Var.f25500d;
    }

    /* JADX INFO: renamed from: e */
    public final int m13246e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7615p(arrayList, f));
        int i = n73Var.f25499c - n73Var.f25498b;
        int i2 = n73Var.f25500d;
        if (i == 0) {
            return i2;
        }
        C1328xe c1328xe = n73Var.f25497a;
        float f2 = f - n73Var.f25502f;
        hl4 hl4Var = c1328xe.f34185c;
        int i3 = (int) (f2 - 0.0f);
        int i4 = hl4Var.f20680g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = hl4Var.f20679f.getLineForVertical(i3 - hl4Var.f20681h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    /* JADX INFO: renamed from: f */
    public final float m13247f(int i) {
        m13252l(i);
        ArrayList arrayList = this.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7614o(arrayList, i));
        C1328xe c1328xe = n73Var.f25497a;
        return c1328xe.f34185c.m6436i(i - n73Var.f25500d) + n73Var.f25502f;
    }

    /* JADX INFO: renamed from: g */
    public final int m13248g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f35539h;
        n73 n73Var = (n73) arrayList.get(ks5.m7615p(arrayList, fIntBitsToFloat));
        int i2 = n73Var.f25499c;
        int i3 = n73Var.f25498b;
        if (i2 - i3 == 0) {
            return i3;
        }
        C1328xe c1328xe = n73Var.f25497a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - n73Var.f25502f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        hl4 hl4Var = c1328xe.f34185c;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f);
        Layout layout = hl4Var.f20679f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - hl4Var.f20681h);
        if (lineForVertical >= hl4Var.f20680g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (hl4Var.m6429b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    /* JADX INFO: renamed from: h */
    public final long m13249h(jl3 jl3Var, int i, ds3 ds3Var) {
        long jM8570b;
        long j;
        float f = jl3Var.f22397b;
        ArrayList arrayList = this.f35539h;
        int iM7615p = ks5.m7615p(arrayList, f);
        float f2 = ((n73) arrayList.get(iM7615p)).f25503g;
        float f3 = jl3Var.f22399d;
        if (f2 >= f3 || iM7615p == kx5.m7689T(arrayList)) {
            n73 n73Var = (n73) arrayList.get(iM7615p);
            return n73Var.m8570b(n73Var.f25497a.m12674b(n73Var.m8571c(jl3Var), i, ds3Var), true);
        }
        int iM7615p2 = ks5.m7615p(arrayList, f3);
        long jM8570b2 = ql4.f28556b;
        while (true) {
            jM8570b = ql4.f28556b;
            if (!ql4.m9899c(jM8570b2, jM8570b) || iM7615p > iM7615p2) {
                break;
            }
            n73 n73Var2 = (n73) arrayList.get(iM7615p);
            jM8570b2 = n73Var2.m8570b(n73Var2.f25497a.m12674b(n73Var2.m8571c(jl3Var), i, ds3Var), true);
            iM7615p++;
        }
        if (ql4.m9899c(jM8570b2, jM8570b)) {
            return jM8570b;
        }
        while (true) {
            j = ql4.f28556b;
            if (!ql4.m9899c(jM8570b, j) || iM7615p > iM7615p2) {
                break;
            }
            n73 n73Var3 = (n73) arrayList.get(iM7615p2);
            jM8570b = n73Var3.m8570b(n73Var3.f25497a.m12674b(n73Var3.m8571c(jl3Var), i, ds3Var), true);
            iM7615p2--;
        }
        return ql4.m9899c(jM8570b, j) ? jM8570b2 : sc6.m10657b((int) (jM8570b2 >> 32), (int) (4294967295L & jM8570b));
    }

    /* JADX INFO: renamed from: j */
    public final void m13250j(int i) {
        C0875lk c0875lk = (C0875lk) this.f35532a.f29651b;
        if (i < 0 || i >= c0875lk.f24092b.length()) {
            r32.m10186a("offset(" + i + ") is out of bounds [0, " + c0875lk.f24092b.length() + ")");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13251k(int i) {
        C0875lk c0875lk = (C0875lk) this.f35532a.f29651b;
        if (i < 0 || i > c0875lk.f24092b.length()) {
            r32.m10186a("offset(" + i + ") is out of bounds [0, " + c0875lk.f24092b.length() + "]");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13252l(int i) {
        boolean z = false;
        int i2 = this.f35537f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        r32.m10186a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
