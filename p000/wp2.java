package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wp2 {

    /* JADX INFO: renamed from: a */
    public jp0 f33578a;

    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x014c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    /* JADX WARN: Code duplicated, block: B:54:0x0161  */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0171  */
    /* JADX WARN: Code duplicated, block: B:59:0x017f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0187  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0198  */
    /* JADX WARN: Code duplicated, block: B:65:0x019c  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fd  */
    /* JADX INFO: renamed from: a */
    public static int m12352a(jp0 jp0Var, Object obj, Object obj2) {
        int iM10754j;
        int iMo7750M;
        int iM10753i;
        int i;
        u15 u15Var;
        int iM10752h;
        int iMo7750M2;
        int iM10753i2;
        u15 u15Var2 = (u15) jp0Var.f22481b;
        int i2 = qe1.f28412c;
        int iM10754j2 = 1;
        int iM10752h2 = C1145sh.m10752h(1);
        r15 r15Var = u15.f31601d;
        if (u15Var2 == r15Var) {
            iM10752h2 *= 2;
        }
        Object obj3 = null;
        switch (u15Var2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM10754j = 8;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue >> 31) ^ (iIntValue << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue >> 63) ^ (jLongValue << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iM10754j = 4;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iM10754j = C1145sh.m10754j(((Long) obj).longValue());
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iM10754j = C1145sh.m10754j(((Long) obj).longValue());
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iM10754j = C1145sh.m10754j(((Integer) obj).intValue());
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iM10754j = 8;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iM10754j = 4;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iM10754j = 1;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof n50) {
                    iMo7750M = ((n50) obj).size();
                    iM10753i = C1145sh.m10753i(iMo7750M);
                } else {
                    iMo7750M = wv4.f33788a.mo7750M((String) obj);
                    iM10753i = C1145sh.m10753i(iMo7750M);
                }
                iM10754j = iMo7750M + iM10753i;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iM10754j = ((vr1) ((AbstractC1277w1) obj)).mo11979a(null);
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                if (obj instanceof n62) {
                    obj3.getClass();
                    throw null;
                }
                iMo7750M = ((vr1) ((AbstractC1277w1) obj)).mo11979a(null);
                iM10753i = C1145sh.m10753i(iMo7750M);
                iM10754j = iMo7750M + iM10753i;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof n50) {
                    iMo7750M = ((n50) obj).size();
                    iM10753i = C1145sh.m10753i(iMo7750M);
                } else {
                    iMo7750M = ((byte[]) obj).length;
                    iM10753i = C1145sh.m10753i(iMo7750M);
                }
                iM10754j = iMo7750M + iM10753i;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iM10754j = C1145sh.m10753i(((Integer) obj).intValue());
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iM10754j = C1145sh.m10754j(((Integer) obj).intValue());
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iM10754j = 4;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iM10754j = 8;
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iM10754j = C1145sh.m10753i((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iM10754j = C1145sh.m10754j((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i = iM10754j + iM10752h2;
                u15Var = (u15) jp0Var.f22482c;
                iM10752h = C1145sh.m10752h(2);
                if (u15Var == r15Var) {
                    iM10752h *= 2;
                }
                switch (u15Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 2:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 3:
                        iM10754j2 = C1145sh.m10754j(((Long) obj2).longValue());
                        return iM10754j2 + iM10752h + i;
                    case 4:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 5:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return iM10754j2 + iM10752h + i;
                    case 8:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = wv4.f33788a.mo7750M((String) obj2);
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 9:
                        iM10754j2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        return iM10754j2 + iM10752h + i;
                    case 10:
                        if (!(obj2 instanceof n62)) {
                            obj3.getClass();
                            throw null;
                        }
                        iMo7750M2 = ((vr1) ((AbstractC1277w1) obj2)).mo11979a(null);
                        iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 11:
                        if (obj2 instanceof n50) {
                            iMo7750M2 = ((n50) obj2).size();
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        } else {
                            iMo7750M2 = ((byte[]) obj2).length;
                            iM10753i2 = C1145sh.m10753i(iMo7750M2);
                        }
                        iM10754j2 = iM10753i2 + iMo7750M2;
                        return iM10754j2 + iM10752h + i;
                    case 12:
                        iM10754j2 = C1145sh.m10753i(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 13:
                        iM10754j2 = C1145sh.m10754j(((Integer) obj2).intValue());
                        return iM10754j2 + iM10752h + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM10754j2 = 4;
                        return iM10754j2 + iM10752h + i;
                    case 15:
                        ((Long) obj2).getClass();
                        iM10754j2 = 8;
                        return iM10754j2 + iM10752h + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iM10754j2 = C1145sh.m10753i((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iM10754j2 + iM10752h + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iM10754j2 = C1145sh.m10754j((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iM10754j2 + iM10752h + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
