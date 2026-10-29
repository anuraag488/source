package p000;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ty3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ vy3 f31538a;

    /* JADX WARN: Code duplicated, block: B:102:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x0207  */
    /* JADX WARN: Code duplicated, block: B:106:0x020c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:109:0x0218  */
    /* JADX WARN: Code duplicated, block: B:112:0x0224  */
    /* JADX WARN: Code duplicated, block: B:114:0x0229  */
    /* JADX WARN: Code duplicated, block: B:116:0x0231  */
    /* JADX WARN: Code duplicated, block: B:117:0x0235  */
    /* JADX WARN: Code duplicated, block: B:119:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x023e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0246  */
    /* JADX WARN: Code duplicated, block: B:130:0x0267  */
    /* JADX WARN: Code duplicated, block: B:141:0x028f  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02df  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:171:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b A[PHI: r8
  0x013b: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:76:0x0169, B:65:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:80:0x0187  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final long m11196a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fM12221h;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM3429g;
        long jM3429g2;
        boolean z;
        boolean zM10219f;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        vy3 vy3Var = this.f31538a;
        vy3Var.f32967j = i;
        C1289wd c1289wd = vy3Var.f32959b;
        if (c1289wd == null || !vy3Var.m12029b()) {
            return vy3Var.m12031d(vy3Var.f32968k, j, i);
        }
        byte b = vy3Var.f32967j;
        b71 b71Var = vy3Var.f32970m;
        r61 r61Var = c1289wd.f33246c;
        if (h74.m6274f(c1289wd.f33250g)) {
            return ((b33) b71Var.invoke(b33.m3423a(j))).f15059a;
        }
        if (!c1289wd.f33249f) {
            if (r61.m10220g(r61Var.f29050f)) {
                c1289wd.m12220g(0L);
            }
            if (r61.m10220g(r61Var.f29051g)) {
                c1289wd.m12221h(0L);
            }
            if (r61.m10220g(r61Var.f29048d)) {
                c1289wd.m12222i(0L);
            }
            if (r61.m10220g(r61Var.f29049e)) {
                c1289wd.m12219f(0L);
            }
            c1289wd.f33249f = true;
        }
        int i5 = AbstractC1216ue.f31795a;
        float f = b == 2 ? 4.0f : 1.0f;
        long jM3431i = b33.m3431i(j, f);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!r61.m10220g(r61Var.f29048d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (r61.m10220g(r61Var.f29049e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fM12219f = c1289wd.m12219f(jM3431i);
                    if (!r61.m10220g(r61Var.f29049e)) {
                        r61Var.m10222b().finish();
                    }
                    fIntBitsToFloat = fM12219f == Float.intBitsToFloat((int) (jM3431i & 4294967295L)) ? Float.intBitsToFloat(i6) : fM12219f / f;
                }
            } else {
                float fM12222i = c1289wd.m12222i(jM3431i);
                j2 = 4294967295L;
                if (!r61.m10220g(r61Var.f29048d)) {
                    r61Var.m10225e().finish();
                }
                fIntBitsToFloat = fM12222i == Float.intBitsToFloat((int) (jM3431i & 4294967295L)) ? Float.intBitsToFloat(i6) : fM12222i / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!r61.m10220g(r61Var.f29050f) && Float.intBitsToFloat(i2) < 0.0f) {
                fM12221h = c1289wd.m12220g(jM3431i);
                if (!r61.m10220g(r61Var.f29050f)) {
                    r61Var.m10223c().finish();
                }
                if (fM12221h == Float.intBitsToFloat((int) (jM3431i >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fM12221h / f;
                }
            } else if (r61.m10220g(r61Var.f29051g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fM12221h = c1289wd.m12221h(jM3431i);
                if (!r61.m10220g(r61Var.f29051g)) {
                    r61Var.m10224d().finish();
                }
                if (fM12221h == Float.intBitsToFloat((int) (jM3431i >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fM12221h / f;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!b33.m3425c(jFloatToRawIntBits, 0L)) {
                c1289wd.m12217d();
            }
            jM3429g = b33.m3429g(j, jFloatToRawIntBits);
            long j3 = ((b33) b71Var.invoke(b33.m3423a(jM3429g))).f15059a;
            jM3429g2 = b33.m3429g(jM3429g, j3);
            if ((Float.intBitsToFloat((int) (jM3429g >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM3429g & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (r61.m10220g(r61Var.f29050f) || r61.m10220g(r61Var.f29048d) || r61.m10220g(r61Var.f29051g) || r61.m10220g(r61Var.f29049e)))) {
                c1289wd.m12214a();
            }
            if (b == 1) {
                i3 = (int) (jM3429g2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    c1289wd.m12220g(jM3429g2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        c1289wd.m12221h(jM3429g2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jM3429g2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        c1289wd.m12222i(jM3429g2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            c1289wd.m12219f(jM3429g2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jM3429g2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    c1289wd.m12222i(jM3429g2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        c1289wd.m12219f(jM3429g2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!b33.m3425c(jM3429g, 0L)) {
                if (r61.m10219f(r61Var.f29050f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zM10219f = false;
                } else {
                    EdgeEffect edgeEffectM10223c = r61Var.m10223c();
                    Float.intBitsToFloat(i2);
                    edgeEffectM10223c.onRelease();
                    zM10219f = r61.m10219f(r61Var.f29050f);
                }
                if (r61.m10219f(r61Var.f29051g) && Float.intBitsToFloat(i2) > 0.0f) {
                    EdgeEffect edgeEffectM10224d = r61Var.m10224d();
                    Float.intBitsToFloat(i2);
                    edgeEffectM10224d.onRelease();
                    if (!zM10219f || r61.m10219f(r61Var.f29051g)) {
                        zM10219f = true;
                    } else {
                        zM10219f = false;
                    }
                }
                if (r61.m10219f(r61Var.f29048d) && Float.intBitsToFloat(i6) < 0.0f) {
                    EdgeEffect edgeEffectM10225e = r61Var.m10225e();
                    Float.intBitsToFloat(i6);
                    edgeEffectM10225e.onRelease();
                    if (!zM10219f || r61.m10219f(r61Var.f29048d)) {
                        zM10219f = true;
                    } else {
                        zM10219f = false;
                    }
                }
                if (r61.m10219f(r61Var.f29049e) && Float.intBitsToFloat(i6) > 0.0f) {
                    EdgeEffect edgeEffectM10222b = r61Var.m10222b();
                    Float.intBitsToFloat(i6);
                    edgeEffectM10222b.onRelease();
                    if (!zM10219f || r61.m10219f(r61Var.f29049e)) {
                        zM10219f = true;
                    } else {
                        zM10219f = false;
                    }
                }
                if (!zM10219f || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                c1289wd.m12217d();
            }
            return b33.m3430h(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!r61.m10220g(r61Var.f29050f)) {
            if (r61.m10220g(r61Var.f29051g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (r61.m10220g(r61Var.f29051g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!b33.m3425c(jFloatToRawIntBits, 0L)) {
            c1289wd.m12217d();
        }
        jM3429g = b33.m3429g(j, jFloatToRawIntBits);
        long j4 = ((b33) b71Var.invoke(b33.m3423a(jM3429g))).f15059a;
        jM3429g2 = b33.m3429g(jM3429g, j4);
        if (Float.intBitsToFloat((int) (jM3429g >> 32)) == 0.0f) {
            c1289wd.m12214a();
        } else {
            c1289wd.m12214a();
        }
        if (b == 1) {
            i3 = (int) (jM3429g2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                c1289wd.m12220g(jM3429g2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    c1289wd.m12221h(jM3429g2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jM3429g2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    c1289wd.m12222i(jM3429g2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        c1289wd.m12219f(jM3429g2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jM3429g2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                c1289wd.m12222i(jM3429g2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    c1289wd.m12219f(jM3429g2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!b33.m3425c(jM3429g, 0L)) {
            if (r61.m10219f(r61Var.f29050f)) {
                zM10219f = false;
            } else {
                zM10219f = false;
            }
            if (r61.m10219f(r61Var.f29051g)) {
                EdgeEffect edgeEffectM10224d2 = r61Var.m10224d();
                Float.intBitsToFloat(i2);
                edgeEffectM10224d2.onRelease();
                if (zM10219f) {
                    zM10219f = true;
                } else {
                    zM10219f = true;
                }
            }
            if (r61.m10219f(r61Var.f29048d)) {
                EdgeEffect edgeEffectM10225e2 = r61Var.m10225e();
                Float.intBitsToFloat(i6);
                edgeEffectM10225e2.onRelease();
                if (zM10219f) {
                    zM10219f = true;
                } else {
                    zM10219f = true;
                }
            }
            if (r61.m10219f(r61Var.f29049e)) {
                EdgeEffect edgeEffectM10222b2 = r61Var.m10222b();
                Float.intBitsToFloat(i6);
                edgeEffectM10222b2.onRelease();
                if (zM10219f) {
                    zM10219f = true;
                } else {
                    zM10219f = true;
                }
            }
            if (zM10219f) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            c1289wd.m12217d();
        }
        return b33.m3430h(jFloatToRawIntBits, j4);
    }
}
