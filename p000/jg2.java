package p000;

import android.view.ViewGroup;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jg2 implements ph0 {

    /* JADX INFO: renamed from: a */
    public wf2 f22230a;

    /* JADX INFO: renamed from: b */
    public ui0 f22231b;

    /* JADX INFO: renamed from: c */
    public he4 f22232c;

    /* JADX INFO: renamed from: d */
    public int f22233d;

    /* JADX INFO: renamed from: e */
    public int f22234e;

    /* JADX INFO: renamed from: f */
    public lw2 f22235f;

    /* JADX INFO: renamed from: g */
    public lw2 f22236g;

    /* JADX INFO: renamed from: h */
    public eg2 f22237h;

    /* JADX INFO: renamed from: i */
    public bg2 f22238i;

    /* JADX INFO: renamed from: j */
    public lw2 f22239j;

    /* JADX INFO: renamed from: k */
    public ge4 f22240k;

    /* JADX INFO: renamed from: l */
    public lw2 f22241l;

    /* JADX INFO: renamed from: m */
    public uw2 f22242m;

    /* JADX INFO: renamed from: n */
    public int f22243n;

    /* JADX INFO: renamed from: o */
    public int f22244o;

    /* JADX INFO: renamed from: p */
    public String f22245p;

    /* JADX INFO: renamed from: e */
    public static void m7091e(cg2 cg2Var) {
        mw2 mw2Var;
        n93 n93Var = cg2Var.f16002f;
        if (n93Var != null) {
            n93Var.f25574h.set(p93.f27469b);
            om3 om3Var = n93Var.f25577k;
            if (om3Var.f26883d.m8416h()) {
                mw2Var = om3Var.f26883d;
                mw2 mw2Var2 = uv3.f32207a;
                om3Var.f26883d = new mw2();
                om3Var.f26882c.m11668g();
            } else {
                mw2Var = null;
            }
            om3Var.m9185b();
            zi0 zi0Var = n93Var.f25567a;
            zi0Var.f36127q = null;
            if (mw2Var != null) {
                zi0Var.f36131u.f26890k = mw2Var;
                zi0Var.f36133w = (byte) 2;
            }
            cg2Var.f16002f = null;
            zi0 zi0Var2 = cg2Var.f15999c;
            if (zi0Var2 != null) {
                zi0Var2.mo8488a();
            }
            cg2Var.f15999c = null;
        }
    }

    @Override // p000.ph0
    /* JADX INFO: renamed from: a */
    public final void mo3600a() {
        m7097j(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m7092b(cg2 cg2Var, boolean z) {
        n93 n93Var = cg2Var.f16002f;
        if (n93Var != null) {
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            try {
                wf2 wf2Var = this.f22230a;
                wf2Var.f33328r = true;
                if (z) {
                    while (!n93Var.m8633c()) {
                        try {
                            n93Var.m8635e(new xd2((byte) 5));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                n93Var.m8631a();
                cg2Var.f16002f = null;
                wf2Var.f33328r = false;
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            } catch (Throwable th2) {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // p000.ph0
    /* JADX INFO: renamed from: c */
    public final void mo3602c() {
        zi0 zi0Var;
        wf2 wf2Var = this.f22230a;
        wf2Var.f33328r = true;
        lw2 lw2Var = this.f22235f;
        Object[] objArr = lw2Var.f24420c;
        long[] jArr = lw2Var.f24418a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (zi0Var = ((cg2) objArr[(i << 3) + i3]).f15999c) != null) {
                            zi0Var.mo8488a();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        wf2Var.m12264R();
        wf2Var.f33328r = false;
        lw2Var.m8126a();
        this.f22236g.m8126a();
        this.f22244o = 0;
        this.f22243n = 0;
        this.f22239j.m8126a();
        m7096i();
    }

    @Override // p000.ph0
    /* JADX INFO: renamed from: d */
    public final void mo3603d() {
        m7097j(true);
    }

    /* JADX INFO: renamed from: f */
    public final de4 m7093f(Object obj) {
        if (!this.f22230a.m12256J()) {
            return new hg2();
        }
        ig2 ig2Var = new ig2();
        ig2Var.f21405b = this;
        ig2Var.f21406c = obj;
        int[] iArr = v52.f32420a;
        ig2Var.f21404a = new mv2();
        VarHandle.storeStoreFence();
        return ig2Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m7094g(int i) {
        boolean z;
        boolean z2 = false;
        this.f22243n = 0;
        List listM12289p = this.f22230a.m12289p();
        aw2 aw2Var = (aw2) listM12289p;
        int i2 = (((uw2) aw2Var.f14915b).f32213c - this.f22244o) - 1;
        if (i <= i2) {
            this.f22240k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    ((dw2) this.f22240k.f19758b).m4773a(((cg2) this.f22235f.m8132g((wf2) aw2Var.get(i3))).f15997a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f22232c.mo5959b(this.f22240k);
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            z = false;
            while (i2 >= i) {
                try {
                    wf2 wf2Var = (wf2) ((aw2) listM12289p).get(i2);
                    cg2 cg2Var = (cg2) this.f22235f.m8132g(wf2Var);
                    Object obj = cg2Var.f15997a;
                    if (((dw2) this.f22240k.f19758b).m4775c(obj)) {
                        this.f22243n++;
                        if (((Boolean) cg2Var.f16003g.getValue()).booleanValue()) {
                            ag2 ag2Var = wf2Var.f33300H;
                            wq2 wq2Var = ag2Var.f14483p;
                            uf2 uf2Var = uf2.f31823c;
                            wq2Var.f33627l = uf2Var;
                            yo2 yo2Var = ag2Var.f14484q;
                            if (yo2Var != null) {
                                yo2Var.f35407j = uf2Var;
                            }
                            m7100m(cg2Var, false);
                            if (cg2Var.f16004h) {
                                z = true;
                            }
                        }
                    } else {
                        wf2 wf2Var2 = this.f22230a;
                        wf2Var2.f33328r = true;
                        this.f22235f.m8136k(wf2Var);
                        zi0 zi0Var = cg2Var.f15999c;
                        if (zi0Var != null) {
                            zi0Var.mo8488a();
                        }
                        this.f22230a.m12265S(i2, 1);
                        wf2Var2.f33328r = false;
                    }
                    this.f22236g.m8136k(obj);
                    i2--;
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            }
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (k94.f23012c) {
                mw2 mw2Var = k94.f23019j.f29681h;
                if (mw2Var != null && mw2Var.m8416h()) {
                    z2 = true;
                }
            }
            if (z2) {
                k94.m7446c();
            }
        }
        m7096i();
    }

    /* JADX INFO: renamed from: h */
    public final void m7095h(Object obj) {
        wf2 wf2Var = this.f22230a;
        m7096i();
        wf2 wf2Var2 = (wf2) this.f22239j.m8136k(obj);
        if (wf2Var2 != null) {
            if (this.f22244o <= 0) {
                q32.m9721c("No pre-composed items to dispose");
            }
            int iM11670j = ((uw2) ((aw2) wf2Var.m12289p()).f14915b).m11670j(wf2Var2);
            if (iM11670j < ((uw2) ((aw2) wf2Var.m12289p()).f14915b).f32213c - this.f22244o) {
                q32.m9721c("Item is not in pre-composed item range");
            }
            this.f22243n++;
            this.f22244o--;
            cg2 cg2Var = (cg2) this.f22235f.m8132g(wf2Var2);
            if (cg2Var != null) {
                m7091e(cg2Var);
            }
            int i = (((uw2) ((aw2) wf2Var.m12289p()).f14915b).f32213c - this.f22244o) - this.f22243n;
            m7098k(iM11670j, i);
            m7094g(i);
        }
        if (this.f22242m.m11669h(obj)) {
            wf2.m12245X(wf2Var, true, 6);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7096i() {
        int i = ((uw2) ((aw2) this.f22230a.m12289p()).f14915b).f32213c;
        int i2 = this.f22235f.f24422e;
        if (i2 != i) {
            q32.m9719a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.f22243n;
        int i4 = this.f22244o;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbM13624x = zi4.m13624x("Incorrect state. Total children ", i, ". Reusable children ", i3, ". Precomposed children ");
            sbM13624x.append(i4);
            q32.m9719a(sbM13624x.toString());
        }
        int i5 = this.f22239j.f24422e;
        int i6 = this.f22244o;
        if (i5 == i6) {
            return;
        }
        q32.m9719a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    /* JADX INFO: renamed from: j */
    public final void m7097j(boolean z) {
        this.f22244o = 0;
        this.f22239j.m8126a();
        List listM12289p = this.f22230a.m12289p();
        int i = ((uw2) ((aw2) listM12289p).f14915b).f32213c;
        if (this.f22243n != i) {
            this.f22243n = i;
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    wf2 wf2Var = (wf2) ((aw2) listM12289p).get(i2);
                    cg2 cg2Var = (cg2) this.f22235f.m8132g(wf2Var);
                    if (cg2Var != null && ((Boolean) cg2Var.f16003g.getValue()).booleanValue()) {
                        ag2 ag2Var = wf2Var.f33300H;
                        wq2 wq2Var = ag2Var.f14483p;
                        uf2 uf2Var = uf2.f31823c;
                        wq2Var.f33627l = uf2Var;
                        yo2 yo2Var = ag2Var.f14484q;
                        if (yo2Var != null) {
                            yo2Var.f35407j = uf2Var;
                        }
                        m7100m(cg2Var, z);
                        cg2Var.f15997a = ae4.f14404a;
                    }
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            }
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            this.f22236g.m8126a();
        }
        m7096i();
    }

    /* JADX INFO: renamed from: k */
    public final void m7098k(int i, int i2) {
        wf2 wf2Var = this.f22230a;
        wf2Var.f33328r = true;
        wf2Var.m12260N(i, i2, 1);
        wf2Var.f33328r = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m7099l(Object obj, mq1 mq1Var, boolean z) {
        wf2 wf2Var = this.f22230a;
        if (wf2Var.m12256J()) {
            m7096i();
            if (this.f22236g.m8128c(obj)) {
                return;
            }
            this.f22241l.m8136k(obj);
            lw2 lw2Var = this.f22239j;
            Object objM8132g = lw2Var.m8132g(obj);
            if (objM8132g == null) {
                objM8132g = m7102o(obj);
                if (objM8132g != null) {
                    m7098k(((uw2) ((aw2) wf2Var.m12289p()).f14915b).m11670j(objM8132g), ((uw2) ((aw2) wf2Var.m12289p()).f14915b).f32213c);
                    this.f22244o++;
                } else {
                    int i = ((uw2) ((aw2) wf2Var.m12289p()).f14915b).f32213c;
                    wf2 wf2Var2 = new wf2(2);
                    wf2Var.f33328r = true;
                    wf2Var.m12250C(i, wf2Var2);
                    wf2Var.f33328r = false;
                    this.f22244o++;
                    objM8132g = wf2Var2;
                }
                lw2Var.m8138m(obj, objM8132g);
            }
            m7101n((wf2) objM8132g, obj, z, mq1Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7100m(cg2 cg2Var, boolean z) {
        zi0 zi0Var;
        if (z || !cg2Var.f16004h) {
            cg2Var.f16003g = k43.m7398w(Boolean.FALSE);
        } else {
            cg2Var.f16003g.setValue(Boolean.FALSE);
        }
        if (cg2Var.f16002f != null) {
            m7091e(cg2Var);
            return;
        }
        if (z) {
            zi0 zi0Var2 = cg2Var.f15999c;
            if (zi0Var2 != null) {
                zi0Var2.m13585p();
                return;
            }
            return;
        }
        e63 outOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(this.f22230a)).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            g32 g32Var = new g32((byte) 4);
            g32Var.f19558b = cg2Var;
            VarHandle.storeStoreFence();
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) outOfFrameExecutor).m10600E(g32Var);
            return;
        }
        if (cg2Var.f16004h || (zi0Var = cg2Var.f15999c) == null) {
            return;
        }
        zi0Var.m13585p();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0095 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:44:0x0079, B:47:0x0085, B:59:0x00b0, B:61:0x00c2, B:64:0x00de, B:66:0x00e2, B:78:0x0126, B:67:0x00ef, B:68:0x00fa, B:70:0x00fe, B:72:0x0113, B:76:0x011d, B:75:0x0118, B:77:0x0123, B:62:0x00c5, B:56:0x0095, B:58:0x00a3, B:81:0x0130, B:82:0x013a), top: B:85:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:44:0x0079, B:47:0x0085, B:59:0x00b0, B:61:0x00c2, B:64:0x00de, B:66:0x00e2, B:78:0x0126, B:67:0x00ef, B:68:0x00fa, B:70:0x00fe, B:72:0x0113, B:76:0x011d, B:75:0x0118, B:77:0x0123, B:62:0x00c5, B:56:0x0095, B:58:0x00a3, B:81:0x0130, B:82:0x013a), top: B:85:0x0079 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    public final void m7101n(wf2 wf2Var, Object obj, boolean z, mq1 mq1Var) {
        boolean z2;
        zi0 zi0Var;
        lw2 lw2Var = this.f22235f;
        Object objM8132g = lw2Var.m8132g(wf2Var);
        Object obj2 = objM8132g;
        if (objM8132g == null) {
            pg0 pg0Var = i20.f21052f;
            cg2 cg2Var = new cg2();
            cg2Var.f15997a = obj;
            cg2Var.f15998b = pg0Var;
            cg2Var.f15999c = null;
            cg2Var.f16003g = k43.m7398w(Boolean.TRUE);
            VarHandle.storeStoreFence();
            lw2Var.m8138m(wf2Var, cg2Var);
            obj2 = cg2Var;
        }
        cg2 cg2Var2 = (cg2) obj2;
        boolean z3 = cg2Var2.f15998b != mq1Var;
        if (cg2Var2.f16002f != null) {
            if (z3) {
                m7091e(cg2Var2);
            } else if (z) {
                return;
            } else {
                m7092b(cg2Var2, true);
            }
        }
        zi0 zi0Var2 = cg2Var2.f15999c;
        if (zi0Var2 != null) {
            synchronized (zi0Var2.f36114d) {
                z2 = zi0Var2.f36124n.f24422e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || cg2Var2.f16000d) {
            cg2Var2.f15998b = mq1Var;
            if (cg2Var2.f16002f != null) {
                q32.m9719a("new subcompose call while paused composition is still active");
            }
            e94 e94VarM5353c0 = ev0.m5353c0();
            yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
            e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
            try {
                wf2 wf2Var2 = this.f22230a;
                wf2Var2.f33328r = true;
                zi0 zi0Var3 = cg2Var2.f15999c;
                ui0 ui0Var = this.f22231b;
                if (ui0Var == null) {
                    q32.m9722d("parent composition reference not set");
                    throw new gf0();
                }
                if (zi0Var3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = q35.f28200a;
                        zi0Var = new zi0(ui0Var, new gt4(wf2Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = q35.f28200a;
                        zi0Var = new zi0(ui0Var, new gt4(wf2Var));
                    }
                    zi0Var3 = zi0Var;
                } else {
                    if (zi0Var3.f36133w == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = q35.f28200a;
                            zi0Var = new zi0(ui0Var, new gt4(wf2Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = q35.f28200a;
                            zi0Var = new zi0(ui0Var, new gt4(wf2Var));
                        }
                        zi0Var3 = zi0Var;
                    }
                }
                cg2Var2.f15999c = zi0Var3;
                mq1 pg0Var2 = cg2Var2.f15998b;
                if (((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(this.f22230a)).getOutOfFrameExecutor() != null) {
                    cg2Var2.f16004h = false;
                } else {
                    cg2Var2.f16004h = true;
                    er1 er1Var = new er1((byte) 2);
                    er1Var.f18412b = cg2Var2;
                    er1Var.f18413c = pg0Var2;
                    VarHandle.storeStoreFence();
                    pg0Var2 = new pg0(1524156494, true, er1Var);
                }
                if (z) {
                    if (cg2Var2.f16001e) {
                        zi0Var3.m13582m();
                        zi0Var3.m13589t();
                        cg2Var2.f16002f = zi0Var3.m13584o(true, pg0Var2);
                    } else {
                        cg2Var2.f16002f = zi0Var3.m13584o(zi0Var3.m13582m(), pg0Var2);
                    }
                } else if (cg2Var2.f16001e) {
                    zi0Var3.m13582m();
                    zi0Var3.m13589t();
                    ir1 ir1Var = zi0Var3.f36132v;
                    ir1Var.f21710z = 0;
                    ir1Var.f21709y = true;
                    zi0Var3.f36111a.mo5179a(zi0Var3, pg0Var2);
                    if (ir1Var.f21669F || ir1Var.f21710z != 0) {
                        kd3.m7502a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    ir1Var.f21710z = -1;
                    ir1Var.f21709y = false;
                } else {
                    zi0Var3.m13573B(pg0Var2);
                }
                cg2Var2.f16001e = false;
                wf2Var2.f33328r = false;
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                cg2Var2.f16000d = false;
            } catch (Throwable th) {
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final wf2 m7102o(Object obj) {
        int i;
        lw2 lw2Var = this.f22235f;
        if (this.f22243n == 0) {
            return null;
        }
        aw2 aw2Var = (aw2) this.f22230a.m12289p();
        int i2 = ((uw2) aw2Var.f14915b).f32213c - this.f22244o;
        int i3 = i2 - this.f22243n;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (((cg2) lw2Var.m8132g((wf2) aw2Var.get(i5))).f15997a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                cg2 cg2Var = (cg2) lw2Var.m8132g((wf2) aw2Var.get(i4));
                Object obj2 = cg2Var.f15997a;
                if (obj2 == ae4.f14404a || this.f22232c.mo5965n(obj, obj2)) {
                    cg2Var.f15997a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            m7098k(i5, i3);
        }
        this.f22243n--;
        wf2 wf2Var = (wf2) aw2Var.get(i3);
        cg2 cg2Var2 = (cg2) lw2Var.m8132g(wf2Var);
        cg2Var2.f16003g = k43.m7398w(Boolean.TRUE);
        cg2Var2.f16001e = true;
        cg2Var2.f16000d = true;
        return wf2Var;
    }
}
