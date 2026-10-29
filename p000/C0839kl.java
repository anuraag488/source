package p000;

import java.io.IOException;

/* JADX INFO: renamed from: kl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0839kl implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23207a;

    /* JADX INFO: renamed from: b */
    public Object f23208b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23209c;

    public /* synthetic */ C0839kl(byte b) {
        this.f23207a = b;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    @Override // p000.wp1
    public final Object invoke() {
        float fM10674o;
        ho4 ho4Var;
        byte b = this.f23207a;
        wm0 wm0Var = null;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                a91 a91Var = (a91) this.f23208b;
                if (a91Var == null || (ho4Var = a91Var.f176a) == null) {
                    fM10674o = 0.0f;
                } else {
                    z73 z73Var = ho4Var.f20757b;
                    if (((Boolean) ho4Var.f20758c.invoke()).booleanValue() || z73Var.m13399h() != 0.0f) {
                        float f = ho4Var.f20756a;
                        if (f == 0.0f) {
                            fM10674o = 0.0f;
                        } else {
                            fM10674o = 1.0f - (sc6.m10674o(Math.abs(z73Var.m13399h()) + f, ho4Var.f20756a, 0.0f) / ho4Var.f20756a);
                        }
                    } else {
                        fM10674o = 1.0f;
                    }
                }
                do4 do4Var = (do4) this.f23209c;
                float f2 = fM10674o > 0.01f ? 1.0f : 0.0f;
                long j = do4Var.f17241a;
                long j2 = do4Var.f17242b;
                float fMo3662c = h51.f20397b.mo3662c(f2);
                i33 i33Var = oc0.f26570x;
                long jM9463b = pb0.m9463b(j, i33Var);
                long jM9463b2 = pb0.m9463b(j2, i33Var);
                float fM9465d = pb0.m9465d(jM9463b);
                float fM9469h = pb0.m9469h(jM9463b);
                float fM9468g = pb0.m9468g(jM9463b);
                float fM9466e = pb0.m9466e(jM9463b);
                float fM9465d2 = pb0.m9465d(jM9463b2);
                float fM9469h2 = pb0.m9469h(jM9463b2);
                float fM9468g2 = pb0.m9468g(jM9463b2);
                float fM9466e2 = pb0.m9466e(jM9463b2);
                float f3 = fMo3662c >= 0.0f ? fMo3662c : 0.0f;
                float f4 = f3 <= 1.0f ? f3 : 1.0f;
                return pb0.m9462a(pb0.m9463b(zy5.m13884s(zp0.m13656G(fM9469h, fM9469h2, f4), zp0.m13656G(fM9468g, fM9468g2, f4), zp0.m13656G(fM9466e, fM9466e2, f4), zp0.m13656G(fM9465d, fM9465d2, f4), i33Var), pb0.m9467f(j2)));
            case 1:
                ((yp1) this.f23208b).invoke((lr2) this.f23209c);
                return ju4Var;
            case 2:
                oy1 oy1Var = (oy1) this.f23209c;
                ry1 ry1Var = (ry1) this.f23208b;
                try {
                    if (!ry1Var.m10498a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (ry1Var.m10498a(false, this)) {
                    }
                    oy1Var.m9328a(1, 9, null);
                    zv4.m13808c(ry1Var);
                    return ju4Var;
                } catch (IOException e) {
                    oy1Var.m9328a(2, 2, e);
                } catch (Throwable th) {
                    oy1Var.m9328a(3, 3, null);
                    zv4.m13808c(ry1Var);
                    throw th;
                }
                break;
            case 3:
                lb5.m7910S((zo0) this.f23208b, null, null, new C0821k3(wm0Var, (yp1) this.f23209c, (byte) 4), 3);
                return ju4Var;
            case 4:
                lb5.m7910S((pw3) this.f23208b, null, null, new C0982og((wm0) null, (ye3) this.f23209c), 3);
                return ju4Var;
            default:
                lb5.m7910S((zo0) this.f23208b, null, null, new wp4(null, (od1) this.f23209c), 3);
                return ju4Var;
        }
    }
}
