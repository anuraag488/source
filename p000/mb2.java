package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class mb2 extends AbstractC0893m1 {

    /* JADX INFO: renamed from: f */
    public final va2 f24794f;

    /* JADX INFO: renamed from: g */
    public final g24 f24795g;

    /* JADX INFO: renamed from: h */
    public final Iterator f24796h;

    /* JADX INFO: renamed from: i */
    public String f24797i;

    /* JADX INFO: renamed from: j */
    public aa2 f24798j;

    public mb2(i92 i92Var, va2 va2Var, g24 g24Var, String str, g24 g24Var2) {
        super(i92Var, str);
        this.f24794f = va2Var;
        this.f24795g = g24Var2;
        this.f24796h = va2Var.f32494a.entrySet().iterator();
    }

    @Override // p000.AbstractC0893m1
    /* JADX INFO: renamed from: E */
    public aa2 mo6323E(String str) {
        aa2 aa2Var = this.f24798j;
        return aa2Var == null ? (aa2) eq2.m5273L(str, this.f24794f) : aa2Var;
    }

    @Override // p000.AbstractC0893m1
    /* JADX INFO: renamed from: Q */
    public String mo8185Q(g24 g24Var, int i) {
        String str = this.f24797i;
        return str == null ? g24Var.mo4433e(i) : str;
    }

    @Override // p000.AbstractC0893m1
    /* JADX INFO: renamed from: S */
    public final aa2 mo6324S() {
        return this.f24794f;
    }

    @Override // p000.AbstractC0893m1, p000.iv0
    /* JADX INFO: renamed from: a */
    public final ri0 mo5382a(g24 g24Var) {
        g24 g24Var2 = this.f24795g;
        if (g24Var != g24Var2) {
            return super.mo5382a(g24Var);
        }
        aa2 aa2VarM8174F = m8174F();
        String strMo3641b = g24Var2.mo3641b();
        boolean z = aa2VarM8174F instanceof va2;
        i92 i92Var = this.f24526c;
        if (z) {
            return new mb2(i92Var, (va2) aa2VarM8174F, g24Var, this.f24527d, this.f24795g);
        }
        throw new y92(kx5.m7687R(-1, "Expected " + rl3.m10361a(va2.class).m10249b() + ", but had " + rl3.m10361a(aa2VarM8174F.getClass()).m10249b() + " as the serialized body of " + strMo3641b, m8188U(), null, i92Var.f21188a.f30011d ? kx5.m7695Z(aa2VarM8174F.toString(), -1).toString() : null), null);
    }

    @Override // p000.AbstractC0893m1, p000.iv0
    /* JADX INFO: renamed from: g */
    public final boolean mo5387g() {
        return super.mo5387g();
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: j */
    public int mo6325j(g24 g24Var) {
        while (true) {
            Iterator it = this.f24796h;
            if (!it.hasNext()) {
                return -1;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            i92 i92Var = this.f24526c;
            int iM9804a = qa2.m9804a(g24Var, i92Var, str);
            String strMo5629a = null;
            if (iM9804a != -3) {
                if (this.f24528e.f30010c) {
                    aa2 aa2Var = (aa2) entry.getValue();
                    boolean zMo4437k = g24Var.mo4437k(iM9804a);
                    g24 g24VarMo4436j = g24Var.mo4436j(iM9804a);
                    if (!zMo4437k || g24VarMo4436j.mo5887h() || !(aa2Var instanceof ra2)) {
                        if (z62.m13387o(g24VarMo4436j.mo4431c(), l24.f23749j) && (!g24VarMo4436j.mo5887h() || !(aa2Var instanceof ra2))) {
                            fb2 fb2Var = aa2Var instanceof fb2 ? (fb2) aa2Var : null;
                            if (fb2Var != null) {
                                m32 m32Var = ca2.f15904a;
                                if (!(fb2Var instanceof ra2)) {
                                    strMo5629a = fb2Var.mo5629a();
                                }
                            }
                            if (strMo5629a != null && qa2.m9804a(g24VarMo4436j, i92Var, strMo5629a) == -3 && zMo4437k) {
                            }
                        }
                    }
                }
                this.f24797i = str;
                this.f24798j = (aa2) entry.getValue();
                return iM9804a;
            }
            if (!str.equals(this.f24527d) && !qa2.m9806c(i92Var, g24Var)) {
                throw new y92(kx5.m7687R(-1, zi4.m13617q('\'', "Encountered an unknown key '", str), m8188U(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", i92Var.f21188a.f30011d ? kx5.m7695Z(this.f24794f.toString(), -1).toString() : null), null);
            }
        }
    }

    public /* synthetic */ mb2(i92 i92Var, va2 va2Var, g24 g24Var, String str, int i) {
        this(i92Var, va2Var, g24Var, (i & 8) != 0 ? null : str, (g24) null);
    }
}
