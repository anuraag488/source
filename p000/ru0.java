package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 implements lt0 {

    /* JADX INFO: renamed from: a */
    public cf1 f29625a;

    /* JADX INFO: renamed from: b */
    public hp0 f29626b;

    /* JADX INFO: renamed from: c */
    public um0 f29627c;

    /* JADX INFO: renamed from: d */
    public vt0 f29628d;

    /* JADX INFO: renamed from: e */
    public gx2 f29629e;

    /* JADX INFO: renamed from: f */
    public int f29630f;

    /* JADX INFO: renamed from: g */
    public t82 f29631g;

    /* JADX INFO: renamed from: h */
    public su0 f29632h;

    /* JADX INFO: renamed from: i */
    public C1122rv f29633i;

    /* JADX INFO: renamed from: j */
    public dg4 f29634j;

    /* JADX INFO: renamed from: k */
    public dg4 f29635k;

    /* JADX INFO: renamed from: l */
    public C1283w7 f29636l;

    @Override // p000.lt0
    /* JADX INFO: renamed from: a */
    public final Object mo8106a(mq1 mq1Var, ym0 ym0Var) {
        y70.m13040t(this.f29627c.f31989a);
        return lb5.m7917Z("DataStore.updateData", null, new ge0(this, mq1Var, null, (byte) 2), ym0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m10429b(ym0 ym0Var) {
        wt0 wt0Var;
        gx2 gx2Var;
        if (ym0Var instanceof wt0) {
            wt0Var = (wt0) ym0Var;
            int i = wt0Var.f33717w;
            if ((i & Integer.MIN_VALUE) != 0) {
                wt0Var.f33717w = i - Integer.MIN_VALUE;
            } else {
                wt0Var = new wt0(this, ym0Var);
            }
        } else {
            wt0Var = new wt0(this, ym0Var);
        }
        Object obj = wt0Var.f33715u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = wt0Var.f33717w;
        if (i2 == 0) {
            k43.m7376J(obj);
            gx2 gx2Var2 = this.f29629e;
            wt0Var.f33714t = gx2Var2;
            wt0Var.f33717w = 1;
            if (gx2Var2.m6191e(wt0Var) == ap0Var) {
                return ap0Var;
            }
            gx2Var = gx2Var2;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gx2Var = wt0Var.f33714t;
            k43.m7376J(obj);
        }
        try {
            int i3 = this.f29630f - 1;
            this.f29630f = i3;
            if (i3 == 0) {
                t82 t82Var = this.f29631g;
                if (t82Var != null) {
                    t82Var.mo4993a(null);
                }
                this.f29631g = null;
            }
            return ju4.f22634a;
        } finally {
            gx2Var.m6193g(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final c74 m10430c() {
        return (c74) this.f29635k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m10431d(ks2 ks2Var, ym0 ym0Var) {
        xt0 xt0Var;
        if (ym0Var instanceof xt0) {
            xt0Var = (xt0) ym0Var;
            int i = xt0Var.f34614v;
            if ((i & Integer.MIN_VALUE) != 0) {
                xt0Var.f34614v = i - Integer.MIN_VALUE;
            } else {
                xt0Var = new xt0(this, ym0Var);
            }
        } else {
            xt0Var = new xt0(this, ym0Var);
        }
        Object obj = xt0Var.f34612t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = xt0Var.f34614v;
        if (i2 == 0) {
            k43.m7376J(obj);
            gh3 gh3Var = ks2Var.f23383e;
            yt0 yt0Var = new yt0(this, ks2Var, null);
            xt0Var.f34614v = 1;
            if (lb5.m7917Z("DataStore.handleUpdate", gh3Var, yt0Var, xt0Var) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m10432e(ym0 ym0Var) {
        zt0 zt0Var;
        gx2 gx2Var;
        if (ym0Var instanceof zt0) {
            zt0Var = (zt0) ym0Var;
            int i = zt0Var.f36354w;
            if ((i & Integer.MIN_VALUE) != 0) {
                zt0Var.f36354w = i - Integer.MIN_VALUE;
            } else {
                zt0Var = new zt0(this, ym0Var);
            }
        } else {
            zt0Var = new zt0(this, ym0Var);
        }
        Object obj = zt0Var.f36352u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = zt0Var.f36354w;
        byte b = 1;
        wm0 wm0Var = null;
        if (i2 == 0) {
            k43.m7376J(obj);
            gx2 gx2Var2 = this.f29629e;
            zt0Var.f36351t = gx2Var2;
            zt0Var.f36354w = 1;
            if (gx2Var2.m6191e(zt0Var) == ap0Var) {
                return ap0Var;
            }
            gx2Var = gx2Var2;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gx2Var = zt0Var.f36351t;
            k43.m7376J(obj);
        }
        try {
            int i3 = this.f29630f + 1;
            this.f29630f = i3;
            if (i3 == 1) {
                this.f29631g = lb5.m7910S(this.f29627c, null, null, new C0784j3(this, wm0Var, b), 3);
            }
            return ju4.f22634a;
        } finally {
            gx2Var.m6193g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r11 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r11 == r2) goto L38;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10433f(boolean z, ym0 ym0Var) {
        du0 du0Var;
        wb4 wb4VarM10917b;
        l73 l73Var;
        wb4 wb4Var;
        su0 su0Var = this.f29632h;
        if (ym0Var instanceof du0) {
            du0Var = (du0) ym0Var;
            int i = du0Var.f17389x;
            if ((i & Integer.MIN_VALUE) != 0) {
                du0Var.f17389x = i - Integer.MIN_VALUE;
            } else {
                du0Var = new du0(this, ym0Var);
            }
        } else {
            du0Var = new du0(this, ym0Var);
        }
        Object objM3865a = du0Var.f17387v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = du0Var.f17389x;
        if (i2 == 0) {
            k43.m7376J(objM3865a);
            wb4VarM10917b = su0Var.m10917b();
            if (wb4VarM10917b instanceof wt4) {
                C1077qn.m9989o("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            c74 c74VarM10430c = m10430c();
            du0Var.f17386u = wb4VarM10917b;
            du0Var.f17385t = z;
            du0Var.f17389x = 1;
            objM3865a = c74VarM10430c.m3865a();
            if (objM3865a != ap0Var) {
            }
            return ap0Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                k43.m7376J(objM3865a);
                l73Var = (l73) objM3865a;
                wb4Var = (wb4) l73Var.f23833a;
                if (((Boolean) l73Var.f23834b).booleanValue()) {
                    su0Var.m10918c(wb4Var);
                }
                return wb4Var;
            }
            if (i2 != 3) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objM3865a);
            l73Var = (l73) objM3865a;
            wb4Var = (wb4) l73Var.f23833a;
            if (((Boolean) l73Var.f23834b).booleanValue()) {
                su0Var.m10918c(wb4Var);
            }
            return wb4Var;
        }
        z = du0Var.f17385t;
        wb4VarM10917b = du0Var.f17386u;
        k43.m7376J(objM3865a);
        int iIntValue = ((Number) objM3865a).intValue();
        boolean z2 = wb4VarM10917b instanceof at0;
        int i3 = z2 ? ((at0) wb4VarM10917b).f33220a : -1;
        if (z2 && iIntValue == i3) {
            return wb4VarM10917b;
        }
        gu0 gu0Var = new gu0(this, i3, null);
        if (z) {
            c74 c74VarM10430c2 = m10430c();
            eu0 eu0Var = new eu0(this, gu0Var, z, null);
            du0Var.f17386u = null;
            du0Var.f17385t = z;
            du0Var.f17389x = 2;
            objM3865a = c74VarM10430c2.m3866b(eu0Var, du0Var);
        } else {
            c74 c74VarM10430c3 = m10430c();
            fu0 fu0Var = new fu0(this, gu0Var, (wm0) null);
            du0Var.f17386u = null;
            du0Var.f17385t = z;
            du0Var.f17389x = 3;
            objM3865a = c74VarM10430c3.m3867c(fu0Var, du0Var);
        }
        return ap0Var;
    }

    /* JADX INFO: renamed from: g */
    public final Object m10434g(of4 of4Var) {
        return lb5.m7917Z("DataStore.readDataFromFileOrDefault", null, new bu0(this, null, (byte) 1), of4Var);
    }

    @Override // p000.lt0
    public final si1 getData() {
        return this.f29628d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [mq1] */
    /* JADX WARN: Type inference failed for: r14v0, types: [mq1] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX INFO: renamed from: h */
    public final Object m10435h(boolean z, mq1 mq1Var, ym0 ym0Var) throws Throwable {
        hu0 hu0Var;
        ?? r14;
        if (ym0Var instanceof hu0) {
            hu0Var = (hu0) ym0Var;
            int i = hu0Var.f20865x;
            if ((i & Integer.MIN_VALUE) != 0) {
                hu0Var.f20865x = i - Integer.MIN_VALUE;
            } else {
                hu0Var = new hu0(this, ym0Var);
            }
        } else {
            hu0Var = new hu0(this, ym0Var);
        }
        Object obj = hu0Var.f20863v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = hu0Var.f20865x;
        if (i2 == 0) {
            k43.m7376J(obj);
            hu0Var.f20862u = (of4) mq1Var;
            hu0Var.f20861t = z;
            hu0Var.f20865x = 1;
            obj = null;
            r14 = mq1Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = hu0Var.f20861t;
            mq1 mq1Var2 = (mq1) hu0Var.f20862u;
            k43.m7376J(obj);
            r14 = mq1Var2;
        }
        boolean z2 = z;
        ?? r10 = r14;
        ro0 ro0Var = this.f29627c.f31989a;
        lu0 lu0Var = new lu0(this, (gh3) obj, z2, (mq1) r10, (wm0) null);
        hu0Var.f20862u = null;
        hu0Var.f20861t = z2;
        hu0Var.f20865x = 2;
        Object objM7921b0 = lb5.m7921b0(ro0Var, lu0Var, hu0Var);
        return objM7921b0 == ap0Var ? ap0Var : objM7921b0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: i */
    public final Object m10436i(gh3 gh3Var, ym0 ym0Var) {
        mu0 mu0Var;
        su0 su0Var = this.f29632h;
        if (ym0Var instanceof mu0) {
            mu0Var = (mu0) ym0Var;
            int i = mu0Var.f25217v;
            if ((i & Integer.MIN_VALUE) != 0) {
                mu0Var.f25217v = i - Integer.MIN_VALUE;
            } else {
                mu0Var = new mu0(this, ym0Var);
            }
        } else {
            mu0Var = new mu0(this, ym0Var);
        }
        Object obj = mu0Var.f25215t;
        Object obj2 = ap0.f14763a;
        int i2 = mu0Var.f25217v;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                if (su0Var.m10917b() instanceof yf1) {
                    return su0Var.m10917b();
                }
                mu0Var.f25217v = 1;
                Object objM7917Z = lb5.m7917Z("DataStore.readAndInitOrPropagateAndThrowFailure", gh3Var, new cu0(this, null), mu0Var);
                if (objM7917Z != obj2) {
                    objM7917Z = ju4.f22634a;
                }
                if (objM7917Z != obj2) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
            mu0Var.f25217v = 2;
            Object objM10433f = m10433f(false, mu0Var);
            return objM10433f == obj2 ? obj2 : objM10433f;
        } catch (Throwable th) {
            return new tj3(th, -1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m10437j(Object obj, boolean z, ym0 ym0Var) {
        ou0 ou0Var;
        ol3 ol3Var;
        if (ym0Var instanceof ou0) {
            ou0Var = (ou0) ym0Var;
            int i = ou0Var.f27106w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ou0Var.f27106w = i - Integer.MIN_VALUE;
            } else {
                ou0Var = new ou0(this, ym0Var);
            }
        } else {
            ou0Var = new ou0(this, ym0Var);
        }
        Object obj2 = ou0Var.f27104u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ou0Var.f27106w;
        if (i2 == 0) {
            k43.m7376J(obj2);
            ol3 ol3Var2 = new ol3();
            ff1 ff1Var = (ff1) this.f29634j.getValue();
            qu0 qu0Var = new qu0(this, ol3Var2, obj, z, null);
            ou0Var.f27103t = ol3Var2;
            ou0Var.f27106w = 1;
            if (ff1Var.m5700b(qu0Var, ou0Var) == ap0Var) {
                return ap0Var;
            }
            ol3Var = ol3Var2;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ol3Var = ou0Var.f27103t;
            k43.m7376J(obj2);
        }
        return new Integer(ol3Var.f26851a);
    }
}
