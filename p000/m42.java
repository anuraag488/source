package p000;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m42 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24637a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f24638b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f24639c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f24640d;

    public /* synthetic */ m42(byte b) {
        this.f24637a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f24637a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((cb3) obj).m3952k((db3) this.f24638b, this.f24639c, this.f24640d, 0.0f);
                break;
            case 1:
                db3 db3Var = (db3) this.f24638b;
                ((cb3) obj).m3952k(db3Var, (this.f24639c - db3Var.f16899a) / 2, (this.f24640d - db3Var.f16900b) / 2, 0.0f);
                break;
            case 2:
                int i = this.f24639c;
                db3 db3Var2 = (db3) this.f24638b;
                ((cb3) obj).m3952k(db3Var2, qq2.m10010E((i - db3Var2.f16899a) / 2.0f), qq2.m10010E((this.f24640d - db3Var2.f16900b) / 2.0f), 0.0f);
                break;
            case 3:
                ((cb3) obj).m3952k((db3) this.f24638b, this.f24639c, this.f24640d, 0.0f);
                break;
            default:
                C0489bf c0489bf = (C0489bf) this.f24638b;
                int i2 = this.f24639c;
                int i3 = this.f24640d;
                n73 n73Var = (n73) obj;
                C1328xe c1328xe = n73Var.f25497a;
                int iM8572d = n73Var.m8572d(i2);
                int iM8572d2 = n73Var.m8572d(i3);
                CharSequence charSequence = c1328xe.f34186d;
                if (iM8572d < 0 || iM8572d > iM8572d2 || iM8572d2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbM13624x = zi4.m13624x("start(", iM8572d, ") or end(", iM8572d2, ") is out of range [0..");
                    sbM13624x.append(length);
                    sbM13624x.append("], or start > end!");
                    r32.m10186a(sbM13624x.toString());
                }
                Path path = new Path();
                hl4 hl4Var = c1328xe.f34185c;
                hl4Var.f20679f.getSelectionPath(iM8572d, iM8572d2, path);
                int i4 = hl4Var.f20681h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                C0489bf c0489bf2 = new C0489bf(path);
                c0489bf2.m3567j((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n73Var.f25502f)) & 4294967295L));
                C0489bf.m3558a(c0489bf, c0489bf2);
                break;
        }
        return ju4Var;
    }
}
