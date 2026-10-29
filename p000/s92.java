package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s92 implements hp3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30008a = 1;

    /* JADX INFO: renamed from: b */
    public boolean f30009b;

    /* JADX INFO: renamed from: c */
    public boolean f30010c;

    /* JADX INFO: renamed from: d */
    public boolean f30011d;

    /* JADX INFO: renamed from: e */
    public Object f30012e;

    public s92(boolean z, boolean z2, q90 q90Var, boolean z3) {
        this.f30009b = z;
        this.f30010c = z2;
        this.f30012e = q90Var;
        this.f30011d = z3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[LOOP:0: B:5:0x000f->B:19:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[EDGE_INSN: B:23:0x0056->B:20:0x0056 BREAK  A[LOOP:0: B:5:0x000f->B:19:0x0053], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public void m10564a() {
        lw2 lw2Var = (lw2) this.f30012e;
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
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof cw2) {
                                cw2 cw2Var = (cw2) obj;
                                Object[] objArr2 = cw2Var.f16532a;
                                int i4 = cw2Var.f16533b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
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
        lw2Var.m8126a();
    }

    public String toString() {
        switch (this.f30008a) {
            case 0:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f30009b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='    ', coerceInputValues=" + this.f30010c + ", useArrayPolymorphism=false, classDiscriminator='type', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((q90) this.f30012e) + ", exceptionsWithDebugInfo=" + this.f30011d + ", maxNestingDepth=400)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s92() {
    }
}
