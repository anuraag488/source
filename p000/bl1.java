package p000;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 implements zk1 {

    /* JADX INFO: renamed from: a */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f15394a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserverOnGlobalLayoutListenerC1140sc f15395b;

    /* JADX INFO: renamed from: c */
    public sl1 f15396c;

    /* JADX INFO: renamed from: d */
    public xk1 f15397d;

    /* JADX INFO: renamed from: e */
    public al1 f15398e;

    /* JADX INFO: renamed from: f */
    public tv2 f15399f;

    /* JADX INFO: renamed from: g */
    public cw2 f15400g;

    /* JADX INFO: renamed from: h */
    public sl1 f15401h;

    /* JADX INFO: renamed from: a */
    public final boolean m3615a(boolean z) {
        C0940nb c0940nb;
        if (m3620f() != null) {
            sl1 sl1VarM3620f = m3620f();
            m3623i(null);
            if (sl1VarM3620f != null) {
                sl1VarM3620f.m10854P0(nl1.f25927a, nl1.f25929c);
                if (!sl1VarM3620f.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2 mt2Var = sl1VarM3620f.f25195a.f25199e;
                wf2 wf2VarM10652X = sc6.m10652X(sl1VarM3620f);
                while (wf2VarM10652X != null) {
                    if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 1024) != 0) {
                        while (mt2Var != null) {
                            if ((mt2Var.f25197c & 1024) != 0) {
                                mt2 mt2VarM10644P = mt2Var;
                                uw2 uw2Var = null;
                                while (mt2VarM10644P != null) {
                                    if (mt2VarM10644P instanceof sl1) {
                                        ((sl1) mt2VarM10644P).m10854P0(nl1.f25928b, nl1.f25929c);
                                    } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                        int i = 0;
                                        for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                            if ((mt2Var2.f25197c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    mt2VarM10644P = mt2Var2;
                                                } else {
                                                    if (uw2Var == null) {
                                                        uw2Var = new uw2(new mt2[16]);
                                                    }
                                                    if (mt2VarM10644P != null) {
                                                        uw2Var.m11663b(mt2VarM10644P);
                                                        mt2VarM10644P = null;
                                                    }
                                                    uw2Var.m11663b(mt2Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    mt2VarM10644P = sc6.m10644P(uw2Var);
                                }
                            }
                            mt2Var = mt2Var.f25199e;
                        }
                    }
                    wf2VarM10652X = wf2VarM10652X.m12295v();
                    mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3616b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = kx5.m7705e0(this.f15396c, i).ordinal()) == 0) {
            m3615a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                C0670g.m5864c();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            m3617c();
        }
        return z3;
    }

    /* JADX INFO: renamed from: c */
    public final void m3617c() {
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f15394a;
        if (viewTreeObserverOnGlobalLayoutListenerC1140sc.isFocused() || viewTreeObserverOnGlobalLayoutListenerC1140sc.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC1140sc.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC1140sc.hasFocus()) {
            View viewFindFocus = viewTreeObserverOnGlobalLayoutListenerC1140sc.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC1140sc.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0157 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0167 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:316:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:323:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0160 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0149 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[ADDED_TO_REGION, LOOP:12: B:39:0x0078->B:67:0x00c4, LOOP_START, PHI: r6
  0x0078: PHI (r6v29 mt2) = (r6v23 mt2), (r6v30 mt2) binds: [B:38:0x0076, B:67:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0089 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0102 A[ADDED_TO_REGION, LOOP:16: B:85:0x0102->B:113:0x014e, LOOP_START, PHI: r12
  0x0102: PHI (r12v14 mt2) = (r12v8 mt2), (r12v15 mt2) binds: [B:84:0x0100, B:113:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0104 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0113 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0119 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [uw2] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [uw2] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [mt2] */
    /* JADX WARN: Type inference failed for: r12v25, types: [mt2] */
    /* JADX WARN: Type inference failed for: r12v29, types: [mt2] */
    /* JADX WARN: Type inference failed for: r12v30, types: [mt2] */
    /* JADX WARN: Type inference failed for: r12v34, types: [mt2] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [mt2] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [uw2] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX INFO: renamed from: d */
    public final boolean m3618d(KeyEvent keyEvent, wp1 wp1Var) {
        mt2 mt2Var;
        wf2 wf2VarM10652X;
        px0 px0Var;
        px0 px0Var2;
        mt2 mt2Var2;
        C0940nb c0940nb;
        mt2 mt2VarM10644P;
        uw2 uw2Var;
        mt2 mt2Var3;
        wf2 wf2VarM10652X2;
        px0 px0Var3;
        px0 px0Var4;
        C0940nb c0940nb2;
        uw2 uw2Var2;
        mt2 mt2VarM10644P2;
        int size;
        C0940nb c0940nb3;
        boolean z;
        sl1 sl1Var = this.f15396c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f15397d.f34331e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!m3624j(keyEvent)) {
                Trace.endSection();
                return false;
            }
            sl1 sl1VarM13844H = zy5.m13844H(sl1Var);
            if (sl1VarM13844H != null) {
                if (!sl1VarM13844H.f25195a.f25208n) {
                    q32.m9721c("visitLocalDescendants called on an unattached node");
                }
                mt2 mt2Var4 = sl1VarM13844H.f25195a;
                if ((mt2Var4.f25198d & 9216) != 0) {
                    mt2Var2 = null;
                    for (mt2 mt2Var5 = mt2Var4.f25200f; mt2Var5 != null; mt2Var5 = mt2Var5.f25200f) {
                        int i = mt2Var5.f25197c;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            mt2Var2 = mt2Var5;
                        }
                    }
                } else {
                    mt2Var2 = null;
                }
                if (mt2Var2 == null) {
                    if (sl1VarM13844H == null) {
                        if (!sl1Var.f25195a.f25208n) {
                            q32.m9721c("visitAncestors called on an unattached node");
                        }
                        mt2Var = sl1Var.f25195a.f25199e;
                        wf2VarM10652X = sc6.m10652X(sl1Var);
                        loop15: while (true) {
                            if (wf2VarM10652X != null) {
                                px0Var = null;
                                break;
                            }
                            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 8192) != 0) {
                                while (mt2Var != null) {
                                    if ((mt2Var.f25197c & 8192) != 0) {
                                        mt2VarM10644P = mt2Var;
                                        uw2Var = null;
                                        while (mt2VarM10644P != null) {
                                            if (mt2VarM10644P instanceof wc2) {
                                                px0Var = mt2VarM10644P;
                                                break loop15;
                                            }
                                            if ((mt2VarM10644P.f25197c & 8192) == 0) {
                                            }
                                            mt2VarM10644P = sc6.m10644P(uw2Var);
                                        }
                                    }
                                    mt2Var = mt2Var.f25199e;
                                }
                            }
                            wf2VarM10652X = wf2VarM10652X.m12295v();
                            if (wf2VarM10652X != null) {
                            }
                        }
                        px0Var2 = (wc2) px0Var;
                        if (px0Var2 != null) {
                            mt2Var2 = ((mt2) px0Var2).f25195a;
                        } else {
                            mt2Var2 = null;
                        }
                    } else {
                        if (!sl1VarM13844H.f25195a.f25208n) {
                            q32.m9721c("visitAncestors called on an unattached node");
                        }
                        mt2Var3 = sl1VarM13844H.f25195a;
                        wf2VarM10652X2 = sc6.m10652X(sl1VarM13844H);
                        loop11: while (true) {
                            if (wf2VarM10652X2 != null) {
                                px0Var3 = null;
                                break;
                            }
                            if ((((mt2) wf2VarM10652X2.f33299G.f25610g).f25198d & 8192) != 0) {
                                while (mt2Var3 != null) {
                                    if ((mt2Var3.f25197c & 8192) != 0) {
                                        uw2Var2 = null;
                                        mt2VarM10644P2 = mt2Var3;
                                        while (mt2VarM10644P2 != null) {
                                            if (mt2VarM10644P2 instanceof wc2) {
                                                px0Var3 = mt2VarM10644P2;
                                                break loop11;
                                            }
                                            if ((mt2VarM10644P2.f25197c & 8192) == 0) {
                                            }
                                            mt2VarM10644P2 = sc6.m10644P(uw2Var2);
                                        }
                                    }
                                    mt2Var3 = mt2Var3.f25199e;
                                }
                            }
                            wf2VarM10652X2 = wf2VarM10652X2.m12295v();
                            if (wf2VarM10652X2 != null) {
                            }
                        }
                        px0Var4 = (wc2) px0Var3;
                        if (px0Var4 != null) {
                            mt2Var2 = ((mt2) px0Var4).f25195a;
                        } else {
                            if (!sl1Var.f25195a.f25208n) {
                                q32.m9721c("visitAncestors called on an unattached node");
                            }
                            mt2Var = sl1Var.f25195a.f25199e;
                            wf2VarM10652X = sc6.m10652X(sl1Var);
                            loop15: while (true) {
                                if (wf2VarM10652X != null) {
                                    px0Var = null;
                                    break;
                                }
                                if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 8192) != 0) {
                                    while (mt2Var != null) {
                                        if ((mt2Var.f25197c & 8192) != 0) {
                                            mt2VarM10644P = mt2Var;
                                            uw2Var = null;
                                            while (mt2VarM10644P != null) {
                                                if (mt2VarM10644P instanceof wc2) {
                                                    px0Var = mt2VarM10644P;
                                                    break loop15;
                                                }
                                                if ((mt2VarM10644P.f25197c & 8192) == 0) {
                                                }
                                                mt2VarM10644P = sc6.m10644P(uw2Var);
                                            }
                                        }
                                        mt2Var = mt2Var.f25199e;
                                    }
                                }
                                wf2VarM10652X = wf2VarM10652X.m12295v();
                                if (wf2VarM10652X != null) {
                                }
                            }
                            px0Var2 = (wc2) px0Var;
                            if (px0Var2 != null) {
                                mt2Var2 = ((mt2) px0Var2).f25195a;
                            } else {
                                mt2Var2 = null;
                            }
                        }
                    }
                }
            } else if (sl1VarM13844H == null) {
                if (!sl1Var.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2Var = sl1Var.f25195a.f25199e;
                wf2VarM10652X = sc6.m10652X(sl1Var);
                loop15: while (true) {
                    if (wf2VarM10652X != null) {
                        px0Var = null;
                        break;
                    }
                    if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 8192) != 0) {
                        while (mt2Var != null) {
                            if ((mt2Var.f25197c & 8192) != 0) {
                                mt2VarM10644P = mt2Var;
                                uw2Var = null;
                                while (mt2VarM10644P != null) {
                                    if (mt2VarM10644P instanceof wc2) {
                                        px0Var = mt2VarM10644P;
                                        break loop15;
                                    }
                                    if ((mt2VarM10644P.f25197c & 8192) == 0 && (mt2VarM10644P instanceof qx0)) {
                                        mt2 mt2Var6 = ((qx0) mt2VarM10644P).f28863p;
                                        int i2 = 0;
                                        while (mt2Var6 != null) {
                                            if ((mt2Var6.f25197c & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    mt2VarM10644P = mt2VarM10644P;
                                                    uw2Var = uw2Var;
                                                    uw2Var = uw2Var;
                                                    mt2VarM10644P = mt2Var6;
                                                } else {
                                                    if (uw2Var == null) {
                                                        uw2Var = new uw2(new mt2[16]);
                                                    }
                                                    if (mt2VarM10644P != null) {
                                                        uw2Var.m11663b(mt2VarM10644P);
                                                        mt2VarM10644P = null;
                                                    }
                                                    uw2Var.m11663b(mt2Var6);
                                                }
                                            } else {
                                                mt2VarM10644P = mt2VarM10644P;
                                                uw2Var = uw2Var;
                                            }
                                            mt2Var6 = mt2Var6.f25200f;
                                            mt2VarM10644P = mt2VarM10644P;
                                            uw2Var = uw2Var;
                                        }
                                        if (i2 == 1) {
                                            mt2VarM10644P = mt2VarM10644P;
                                            uw2Var = uw2Var;
                                        } else {
                                            mt2VarM10644P = mt2VarM10644P;
                                            uw2Var = uw2Var;
                                        }
                                    }
                                    mt2VarM10644P = sc6.m10644P(uw2Var);
                                }
                            }
                            mt2Var = mt2Var.f25199e;
                        }
                    }
                    wf2VarM10652X = wf2VarM10652X.m12295v();
                    mt2Var = (wf2VarM10652X != null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
                }
                px0Var2 = (wc2) px0Var;
                if (px0Var2 != null) {
                    mt2Var2 = ((mt2) px0Var2).f25195a;
                } else {
                    mt2Var2 = null;
                }
            } else {
                if (!sl1VarM13844H.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2Var3 = sl1VarM13844H.f25195a;
                wf2VarM10652X2 = sc6.m10652X(sl1VarM13844H);
                loop11: while (true) {
                    if (wf2VarM10652X2 != null) {
                        px0Var3 = null;
                        break;
                    }
                    if ((((mt2) wf2VarM10652X2.f33299G.f25610g).f25198d & 8192) != 0) {
                        while (mt2Var3 != null) {
                            if ((mt2Var3.f25197c & 8192) != 0) {
                                uw2Var2 = null;
                                mt2VarM10644P2 = mt2Var3;
                                while (mt2VarM10644P2 != null) {
                                    if (mt2VarM10644P2 instanceof wc2) {
                                        px0Var3 = mt2VarM10644P2;
                                        break loop11;
                                    }
                                    if ((mt2VarM10644P2.f25197c & 8192) == 0 && (mt2VarM10644P2 instanceof qx0)) {
                                        mt2 mt2Var7 = ((qx0) mt2VarM10644P2).f28863p;
                                        int i3 = 0;
                                        while (mt2Var7 != null) {
                                            if ((mt2Var7.f25197c & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    mt2VarM10644P2 = mt2VarM10644P2;
                                                    uw2Var2 = uw2Var2;
                                                    uw2Var2 = uw2Var2;
                                                    mt2VarM10644P2 = mt2Var7;
                                                } else {
                                                    if (uw2Var2 == null) {
                                                        uw2Var2 = new uw2(new mt2[16]);
                                                    }
                                                    if (mt2VarM10644P2 != null) {
                                                        uw2Var2.m11663b(mt2VarM10644P2);
                                                        mt2VarM10644P2 = null;
                                                    }
                                                    uw2Var2.m11663b(mt2Var7);
                                                }
                                            } else {
                                                mt2VarM10644P2 = mt2VarM10644P2;
                                                uw2Var2 = uw2Var2;
                                            }
                                            mt2Var7 = mt2Var7.f25200f;
                                            mt2VarM10644P2 = mt2VarM10644P2;
                                            uw2Var2 = uw2Var2;
                                        }
                                        if (i3 == 1) {
                                            mt2VarM10644P2 = mt2VarM10644P2;
                                            uw2Var2 = uw2Var2;
                                        } else {
                                            mt2VarM10644P2 = mt2VarM10644P2;
                                            uw2Var2 = uw2Var2;
                                        }
                                    }
                                    mt2VarM10644P2 = sc6.m10644P(uw2Var2);
                                }
                            }
                            mt2Var3 = mt2Var3.f25199e;
                        }
                    }
                    wf2VarM10652X2 = wf2VarM10652X2.m12295v();
                    mt2Var3 = (wf2VarM10652X2 != null || (c0940nb2 = wf2VarM10652X2.f33299G) == null) ? null : (vh4) c0940nb2.f25609f;
                }
                px0Var4 = (wc2) px0Var3;
                if (px0Var4 != null) {
                    mt2Var2 = ((mt2) px0Var4).f25195a;
                } else {
                    if (!sl1Var.f25195a.f25208n) {
                        q32.m9721c("visitAncestors called on an unattached node");
                    }
                    mt2Var = sl1Var.f25195a.f25199e;
                    wf2VarM10652X = sc6.m10652X(sl1Var);
                    loop15: while (true) {
                        if (wf2VarM10652X != null) {
                            px0Var = null;
                            break;
                        }
                        if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 8192) != 0) {
                            while (mt2Var != null) {
                                if ((mt2Var.f25197c & 8192) != 0) {
                                    mt2VarM10644P = mt2Var;
                                    uw2Var = null;
                                    while (mt2VarM10644P != null) {
                                        if (mt2VarM10644P instanceof wc2) {
                                            px0Var = mt2VarM10644P;
                                            break loop15;
                                        }
                                        if ((mt2VarM10644P.f25197c & 8192) == 0) {
                                        }
                                        mt2VarM10644P = sc6.m10644P(uw2Var);
                                    }
                                }
                                mt2Var = mt2Var.f25199e;
                            }
                        }
                        wf2VarM10652X = wf2VarM10652X.m12295v();
                        if (wf2VarM10652X != null) {
                        }
                    }
                    px0Var2 = (wc2) px0Var;
                    if (px0Var2 != null) {
                        mt2Var2 = ((mt2) px0Var2).f25195a;
                    } else {
                        mt2Var2 = null;
                    }
                }
            }
            if (mt2Var2 != null) {
                if (!mt2Var2.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2 mt2Var8 = mt2Var2.f25195a.f25199e;
                wf2 wf2VarM10652X3 = sc6.m10652X(mt2Var2);
                ArrayList arrayList = null;
                while (wf2VarM10652X3 != null) {
                    if ((((mt2) wf2VarM10652X3.f33299G.f25610g).f25198d & 8192) != 0) {
                        while (mt2Var8 != null) {
                            if ((mt2Var8.f25197c & 8192) != 0) {
                                mt2 mt2VarM10644P3 = mt2Var8;
                                uw2 uw2Var3 = null;
                                while (mt2VarM10644P3 != null) {
                                    if (mt2VarM10644P3 instanceof wc2) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(mt2VarM10644P3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (mt2VarM10644P3.f25197c & 8192) != 0 && (mt2VarM10644P3 instanceof qx0)) {
                                        int i4 = 0;
                                        for (mt2 mt2Var9 = ((qx0) mt2VarM10644P3).f28863p; mt2Var9 != null; mt2Var9 = mt2Var9.f25200f) {
                                            if ((mt2Var9.f25197c & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    mt2VarM10644P3 = mt2Var9;
                                                } else {
                                                    if (uw2Var3 == null) {
                                                        uw2Var3 = new uw2(new mt2[16]);
                                                    }
                                                    if (mt2VarM10644P3 != null) {
                                                        uw2Var3.m11663b(mt2VarM10644P3);
                                                        mt2VarM10644P3 = null;
                                                    }
                                                    uw2Var3.m11663b(mt2Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    mt2VarM10644P3 = sc6.m10644P(uw2Var3);
                                }
                            }
                            mt2Var8 = mt2Var8.f25199e;
                        }
                    }
                    wf2VarM10652X3 = wf2VarM10652X3.m12295v();
                    mt2Var8 = (wf2VarM10652X3 == null || (c0940nb3 = wf2VarM10652X3.f33299G) == null) ? null : (vh4) c0940nb3.f25609f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((wc2) arrayList.get(size)).mo6969n(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? M10644P = mt2Var2.f25195a;
                ?? uw2Var4 = 0;
                while (M10644P != 0) {
                    if (M10644P instanceof wc2) {
                        if (((wc2) M10644P).mo6969n(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M10644P.f25197c & 8192) != 0 && (M10644P instanceof qx0)) {
                        mt2 mt2Var10 = ((qx0) M10644P).f28863p;
                        int i6 = 0;
                        while (mt2Var10 != null) {
                            if ((mt2Var10.f25197c & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    uw2Var4 = uw2Var4;
                                    M10644P = M10644P;
                                    uw2Var4 = uw2Var4;
                                    M10644P = mt2Var10;
                                } else {
                                    if (uw2Var4 == 0) {
                                        uw2Var4 = new uw2(new mt2[16]);
                                    }
                                    if (M10644P != 0) {
                                        uw2Var4.m11663b(M10644P);
                                        M10644P = 0;
                                    }
                                    uw2Var4.m11663b(mt2Var10);
                                }
                            } else {
                                uw2Var4 = uw2Var4;
                                M10644P = M10644P;
                            }
                            mt2Var10 = mt2Var10.f25200f;
                            uw2Var4 = uw2Var4;
                            M10644P = M10644P;
                        }
                        if (i6 == 1) {
                            uw2Var4 = uw2Var4;
                            M10644P = M10644P;
                        } else {
                            uw2Var4 = uw2Var4;
                            M10644P = M10644P;
                        }
                    }
                    M10644P = sc6.m10644P(uw2Var4);
                }
                if (((Boolean) wp1Var.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? M10644P2 = mt2Var2.f25195a;
                ?? uw2Var5 = 0;
                while (M10644P2 != 0) {
                    if (M10644P2 instanceof wc2) {
                        if (((wc2) M10644P2).mo6965X(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((M10644P2.f25197c & 8192) != 0 && (M10644P2 instanceof qx0)) {
                        mt2 mt2Var11 = ((qx0) M10644P2).f28863p;
                        int i7 = 0;
                        while (mt2Var11 != null) {
                            if ((mt2Var11.f25197c & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    M10644P2 = M10644P2;
                                    uw2Var5 = uw2Var5;
                                    uw2Var5 = uw2Var5;
                                    M10644P2 = mt2Var11;
                                } else {
                                    if (uw2Var5 == 0) {
                                        uw2Var5 = new uw2(new mt2[16]);
                                    }
                                    if (M10644P2 != 0) {
                                        uw2Var5.m11663b(M10644P2);
                                        M10644P2 = 0;
                                    }
                                    uw2Var5.m11663b(mt2Var11);
                                }
                            } else {
                                M10644P2 = M10644P2;
                                uw2Var5 = uw2Var5;
                            }
                            mt2Var11 = mt2Var11.f25200f;
                            M10644P2 = M10644P2;
                            uw2Var5 = uw2Var5;
                        }
                        if (i7 == 1) {
                            M10644P2 = M10644P2;
                            uw2Var5 = uw2Var5;
                        } else {
                            M10644P2 = M10644P2;
                            uw2Var5 = uw2Var5;
                        }
                    }
                    M10644P2 = sc6.m10644P(uw2Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((wc2) arrayList.get(i8)).mo6965X(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Boolean m3619e(int i, jl3 jl3Var, yp1 yp1Var) {
        boolean zM12985o;
        sl1 sl1Var;
        C0940nb c0940nb;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f15395b;
        sl1 sl1Var2 = this.f15396c;
        sl1 sl1VarM13844H = zy5.m13844H(sl1Var2);
        int i2 = 4;
        boolean zBooleanValue = false;
        if (sl1VarM13844H != null) {
            df2 layoutDirection = viewTreeObserverOnGlobalLayoutListenerC1140sc.getLayoutDirection();
            fl1 fl1VarM10855Q0 = sl1VarM13844H.m10855Q0();
            jl1 jl1Var = fl1VarM10855Q0.f19074h;
            jl1 jl1Var2 = fl1VarM10855Q0.f19075i;
            if (i == 1) {
                jl1Var = fl1VarM10855Q0.f19068b;
            } else if (i == 2) {
                jl1Var = fl1VarM10855Q0.f19069c;
            } else if (i == 5) {
                jl1Var = fl1VarM10855Q0.f19070d;
            } else if (i == 6) {
                jl1Var = fl1VarM10855Q0.f19071e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                    jl1Var = jl1Var2;
                }
                if (jl1Var == jl1.f22391b) {
                    jl1Var = null;
                }
                if (jl1Var == null) {
                    jl1Var = fl1VarM10855Q0.f19072f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    jl1Var = jl1Var2;
                } else if (iOrdinal2 != 1) {
                    C0670g.m5864c();
                    return null;
                }
                if (jl1Var == jl1.f22391b) {
                    jl1Var = null;
                }
                if (jl1Var == null) {
                    jl1Var = fl1VarM10855Q0.f19073g;
                }
            } else {
                if (i != 7 && i != 8) {
                    C1077qn.m9989o("invalid FocusDirection");
                    return null;
                }
                y60 y60Var = new y60(i);
                bl1 bl1Var = (bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1VarM13844H)).getFocusOwner();
                sl1 sl1VarM3620f = bl1Var.m3620f();
                if (i == 7) {
                    fl1VarM10855Q0.f19076j.invoke(y60Var);
                } else {
                    fl1VarM10855Q0.f19077k.invoke(y60Var);
                }
                jl1Var = y60Var.f34920b ? jl1.f22392c : sl1VarM3620f != bl1Var.m3620f() ? jl1.f22393d : jl1.f22391b;
            }
            jl1 jl1Var3 = jl1.f22392c;
            if (!z62.m13387o(jl1Var, jl1Var3)) {
                if (z62.m13387o(jl1Var, jl1.f22393d)) {
                    sl1 sl1VarM13844H2 = zy5.m13844H(sl1Var2);
                    if (sl1VarM13844H2 != null) {
                        return (Boolean) yp1Var.invoke(sl1VarM13844H2);
                    }
                } else {
                    jl1 jl1Var4 = jl1.f22391b;
                    if (!z62.m13387o(jl1Var, jl1Var4)) {
                        if (jl1Var == jl1Var4) {
                            C1077qn.m9989o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (jl1Var == jl1Var3) {
                            C1077qn.m9989o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        uw2 uw2Var = jl1Var.f22394a;
                        int i3 = uw2Var.f32213c;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = uw2Var.f32211a;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                px0 px0Var = (ll1) objArr[i4];
                                if (!((mt2) px0Var).f25195a.f25208n) {
                                    q32.m9721c("visitChildren called on an unattached node");
                                }
                                uw2 uw2Var2 = new uw2(new mt2[16]);
                                mt2 mt2Var = ((mt2) px0Var).f25195a;
                                mt2 mt2Var2 = mt2Var.f25200f;
                                if (mt2Var2 == null) {
                                    sc6.m10663e(uw2Var2, mt2Var);
                                } else {
                                    uw2Var2.m11663b(mt2Var2);
                                }
                                while (true) {
                                    int i5 = uw2Var2.f32213c;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    mt2 mt2VarM10644P = (mt2) uw2Var2.m11672l(i5 - 1);
                                    if ((mt2VarM10644P.f25198d & 1024) == 0) {
                                        sc6.m10663e(uw2Var2, mt2VarM10644P);
                                    } else {
                                        while (mt2VarM10644P != null) {
                                            if ((mt2VarM10644P.f25197c & 1024) != 0) {
                                                uw2 uw2Var3 = null;
                                                while (mt2VarM10644P != null) {
                                                    if (mt2VarM10644P instanceof sl1) {
                                                        if (((Boolean) yp1Var.invoke((sl1) mt2VarM10644P)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                                        int i6 = 0;
                                                        for (mt2 mt2Var3 = ((qx0) mt2VarM10644P).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                                            if ((mt2Var3.f25197c & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    mt2VarM10644P = mt2Var3;
                                                                } else {
                                                                    if (uw2Var3 == null) {
                                                                        uw2Var3 = new uw2(new mt2[16]);
                                                                    }
                                                                    if (mt2VarM10644P != null) {
                                                                        uw2Var3.m11663b(mt2VarM10644P);
                                                                        mt2VarM10644P = null;
                                                                    }
                                                                    uw2Var3.m11663b(mt2Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    mt2VarM10644P = sc6.m10644P(uw2Var3);
                                                }
                                                break;
                                            }
                                            mt2VarM10644P = mt2VarM10644P.f25200f;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        sl1VarM13844H = null;
        df2 layoutDirection2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.getLayoutDirection();
        C1164t c1164t = new C1164t((byte) 16);
        c1164t.f30700c = sl1VarM13844H;
        c1164t.f30701d = this;
        c1164t.f30699b = yp1Var;
        VarHandle.storeStoreFence();
        if (i == 1 || i == 2) {
            if (i == 1) {
                zM12985o = y62.m12937C(sl1Var2, c1164t);
            } else {
                if (i != 2) {
                    C1077qn.m9989o("This function should only be used for 1-D focus search");
                    return null;
                }
                zM12985o = y62.m12985o(sl1Var2, c1164t);
            }
            return Boolean.valueOf(zM12985o);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return y42.m12839L0(i, c1164t, sl1Var2, jl3Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    C0670g.m5864c();
                    return null;
                }
                i2 = 3;
            }
            sl1 sl1VarM13844H3 = zy5.m13844H(sl1Var2);
            if (sl1VarM13844H3 != null) {
                return y42.m12839L0(i2, c1164t, sl1VarM13844H3, jl3Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(mk1.m8338b(i)).toString());
        }
        sl1 sl1VarM13844H4 = zy5.m13844H(sl1Var2);
        if (sl1VarM13844H4 == null) {
            sl1Var = null;
            break;
        }
        if (!sl1VarM13844H4.f25195a.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var4 = sl1VarM13844H4.f25195a.f25199e;
        wf2 wf2VarM10652X = sc6.m10652X(sl1VarM13844H4);
        loop5: while (true) {
            if (wf2VarM10652X == null) {
                sl1Var = null;
                break;
            }
            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 1024) != 0) {
                while (mt2Var4 != null) {
                    if ((mt2Var4.f25197c & 1024) != 0) {
                        mt2 mt2VarM10644P2 = mt2Var4;
                        uw2 uw2Var4 = null;
                        while (mt2VarM10644P2 != null) {
                            if (mt2VarM10644P2 instanceof sl1) {
                                sl1 sl1Var3 = (sl1) mt2VarM10644P2;
                                if (sl1Var3.m10855Q0().f19067a) {
                                    sl1Var = sl1Var3;
                                    break loop5;
                                }
                            } else if ((mt2VarM10644P2.f25197c & 1024) != 0 && (mt2VarM10644P2 instanceof qx0)) {
                                int i7 = 0;
                                for (mt2 mt2Var5 = ((qx0) mt2VarM10644P2).f28863p; mt2Var5 != null; mt2Var5 = mt2Var5.f25200f) {
                                    if ((mt2Var5.f25197c & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            mt2VarM10644P2 = mt2Var5;
                                        } else {
                                            if (uw2Var4 == null) {
                                                uw2Var4 = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P2 != null) {
                                                uw2Var4.m11663b(mt2VarM10644P2);
                                                mt2VarM10644P2 = null;
                                            }
                                            uw2Var4.m11663b(mt2Var5);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    mt2VarM10644P2 = sc6.m10644P(uw2Var4);
                                }
                            }
                            mt2VarM10644P2 = sc6.m10644P(uw2Var4);
                        }
                    }
                    mt2Var4 = mt2Var4.f25199e;
                }
            }
            wf2VarM10652X = wf2VarM10652X.m12295v();
            mt2Var4 = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
        }
        if (sl1Var != null && sl1Var != sl1Var2) {
            zBooleanValue = ((Boolean) c1164t.invoke(sl1Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: f */
    public final sl1 m3620f() {
        sl1 sl1Var = this.f15401h;
        if (sl1Var == null || !sl1Var.f25208n) {
            return null;
        }
        return sl1Var;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3621g(int i, boolean z) {
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f15394a;
        sl1 sl1VarM3620f = m3620f();
        byte b = 1;
        if (sl1VarM3620f == null || !sl1VarM3620f.f30366o || !viewTreeObserverOnGlobalLayoutListenerC1140sc.m10621u(i)) {
            ql3 ql3Var = new ql3();
            ql3Var.f28555a = Boolean.FALSE;
            sl1 sl1VarM3620f2 = m3620f();
            jl3 embeddedViewFocusRect = viewTreeObserverOnGlobalLayoutListenerC1140sc.getEmbeddedViewFocusRect();
            C1391z3 c1391z3 = new C1391z3(b);
            c1391z3.f35731c = ql3Var;
            c1391z3.f35730b = i;
            VarHandle.storeStoreFence();
            Boolean boolM3619e = m3619e(i, embeddedViewFocusRect, c1391z3);
            if (!z62.m13387o(boolM3619e, Boolean.TRUE) || sl1VarM3620f2 == m3620f()) {
                if (boolM3619e != null && ql3Var.f28555a != null) {
                    if (!boolM3619e.booleanValue() || !((Boolean) ql3Var.f28555a).booleanValue()) {
                        if ((i == 1 || i == 2) && z && m3616b(i, false, false)) {
                            C0720hc c0720hc = new C0720hc((byte) 3);
                            c0720hc.f20474b = i;
                            VarHandle.storeStoreFence();
                            Boolean boolM3619e2 = m3619e(i, null, c0720hc);
                            if (boolM3619e2 != null ? boolM3619e2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3622h(int i) {
        if (!m3616b(i, false, false)) {
            return false;
        }
        C0720hc c0720hc = new C0720hc((byte) 2);
        c0720hc.f20474b = i;
        VarHandle.storeStoreFence();
        Boolean boolM3619e = m3619e(i, null, c0720hc);
        boolean zBooleanValue = boolM3619e != null ? boolM3619e.booleanValue() : false;
        if (!zBooleanValue) {
            m3617c();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: i */
    public final void m3623i(sl1 sl1Var) {
        sl1 sl1Var2 = this.f15401h;
        this.f15401h = sl1Var;
        cw2 cw2Var = this.f15400g;
        Object[] objArr = cw2Var.f16532a;
        int i = cw2Var.f16533b;
        for (int i2 = 0; i2 < i; i2++) {
            ((yk1) objArr[i2]).mo10609a(sl1Var2, sl1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    /* JADX INFO: renamed from: j */
    public final boolean m3624j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        boolean z;
        long j;
        int iNumberOfTrailingZeros2;
        int i;
        long[] jArr;
        long jM10079D = qs5.m10079D(keyEvent);
        int iM10083H = qs5.m10083H(keyEvent);
        int i2 = -862048943;
        long j2 = 0;
        int i3 = 8;
        int i4 = 0;
        boolean z2 = true;
        if (iM10083H != 2) {
            if (iM10083H != 1) {
                return true;
            }
            tv2 tv2Var = this.f15399f;
            if (tv2Var == null || !tv2Var.m11181a(jM10079D)) {
                return false;
            }
            tv2 tv2Var2 = this.f15399f;
            if (tv2Var2 != null) {
                int iHashCode = Long.hashCode(jM10079D) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int i6 = i5 & 127;
                int i7 = tv2Var2.f31469c;
                int i8 = i5 >>> 7;
                loop5: while (true) {
                    int i9 = i8 & i7;
                    long[] jArr2 = tv2Var2.f31467a;
                    int i10 = i9 >> 3;
                    int i11 = (i9 & 7) << 3;
                    long j3 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
                    long j4 = (((long) i6) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i9) & i7;
                        if (tv2Var2.f31468b[iNumberOfTrailingZeros] == jM10079D) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i4 += 8;
                    i8 = i9 + i4;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    tv2Var2.f31470d--;
                    long[] jArr3 = tv2Var2.f31467a;
                    int i12 = tv2Var2.f31469c;
                    int i13 = iNumberOfTrailingZeros >> 3;
                    int i14 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i13] & (~(255 << i14))) | (254 << i14);
                    jArr3[i13] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i12) + (i12 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        tv2 tv2Var3 = this.f15399f;
        if (tv2Var3 == null) {
            tv2Var3 = new tv2(3);
            this.f15399f = tv2Var3;
        }
        tv2 tv2Var4 = tv2Var3;
        int iHashCode2 = Long.hashCode(jM10079D) * (-862048943);
        int i15 = iHashCode2 ^ (iHashCode2 << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = tv2Var4.f31469c;
        int i19 = i16 & i18;
        int i20 = 0;
        loop0: while (true) {
            long[] jArr4 = tv2Var4.f31467a;
            int i21 = i19 >> 3;
            int i22 = i2;
            int i23 = (i19 & 7) << 3;
            long j7 = (jArr4[i21] >>> i23) | ((jArr4[i21 + 1] << (64 - i23)) & ((-i23) >> 63));
            long j8 = i17;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i19 + (Long.numberOfTrailingZeros(j10) >> 3)) & i18;
                long j11 = j2;
                if (tv2Var4.f31468b[iNumberOfTrailingZeros2] == jM10079D) {
                    z = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iM11182b = tv2Var4.m11182b(i16);
                if (tv2Var4.f31471e != 0 || ((tv2Var4.f31467a[iM11182b >> 3] >> ((iM11182b & 7) << 3)) & 255) == 254) {
                    z = true;
                    j = 128;
                } else {
                    int i24 = tv2Var4.f31469c;
                    if (i24 <= i3 || Long.compareUnsigned(((long) tv2Var4.f31470d) * 32, ((long) i24) * 25) > 0) {
                        i = i16;
                        z = true;
                        j = 128;
                        int iM11185b = tv3.m11185b(tv2Var4.f31469c);
                        long[] jArr5 = tv2Var4.f31467a;
                        long[] jArr6 = tv2Var4.f31468b;
                        int i25 = tv2Var4.f31469c;
                        tv2Var4.m11183c(iM11185b);
                        long[] jArr7 = tv2Var4.f31467a;
                        long[] jArr8 = tv2Var4.f31468b;
                        int i26 = tv2Var4.f31469c;
                        int i27 = 0;
                        while (i27 < i25) {
                            if (((jArr5[i27 >> 3] >> ((i27 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr6[i27];
                                int iHashCode3 = Long.hashCode(j13) * i22;
                                int i28 = iHashCode3 ^ (iHashCode3 << 16);
                                int iM11182b2 = tv2Var4.m11182b(i28 >>> 7);
                                jArr = jArr7;
                                long j14 = i28 & 127;
                                int i29 = iM11182b2 >> 3;
                                int i30 = (iM11182b2 & 7) << 3;
                                long j15 = (jArr[i29] & (~(255 << i30))) | (j14 << i30);
                                jArr[i29] = j15;
                                jArr[(((iM11182b2 - 7) & i26) + (i26 & 7)) >> 3] = j15;
                                jArr8[iM11182b2] = j13;
                            } else {
                                jArr = jArr7;
                            }
                            i27++;
                            jArr5 = jArr5;
                            jArr7 = jArr;
                        }
                    } else {
                        long[] jArr9 = tv2Var4.f31467a;
                        int i31 = tv2Var4.f31469c;
                        long[] jArr10 = tv2Var4.f31468b;
                        int i32 = (i31 + 7) >> 3;
                        int i33 = 0;
                        while (i33 < i32) {
                            long j16 = jArr9[i33] & (-9187201950435737472L);
                            jArr9[i33] = ((~j16) + (j16 >>> 7)) & (-72340172838076674L);
                            i33++;
                            i3 = i3;
                            i16 = i16;
                        }
                        int i34 = i3;
                        i = i16;
                        j = 128;
                        int length = jArr9.length;
                        int i35 = length - 1;
                        int i36 = length - 2;
                        long j17 = 72057594037927935L;
                        jArr9[i36] = (jArr9[i36] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[i35] = jArr9[0];
                        int i37 = 0;
                        while (i37 != i31) {
                            int i38 = i37 >> 3;
                            int i39 = (i37 & 7) << 3;
                            long j18 = (jArr9[i38] >> i39) & 255;
                            if (j18 != 128 && j18 == 254) {
                                int iHashCode4 = Long.hashCode(jArr10[i37]) * i22;
                                int i40 = iHashCode4 ^ (iHashCode4 << 16);
                                int i41 = i40 >>> 7;
                                int iM11182b3 = tv2Var4.m11182b(i41);
                                int i42 = i41 & i31;
                                long j19 = j17;
                                if (((iM11182b3 - i42) & i31) / 8 == ((i37 - i42) & i31) / i34) {
                                    jArr9[i38] = ((~(255 << i39)) & jArr9[i38]) | (((long) (i40 & 127)) << i39);
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                } else {
                                    int i43 = iM11182b3 >> 3;
                                    long j20 = jArr9[i43];
                                    int i44 = (iM11182b3 & 7) << 3;
                                    if (((j20 >> i44) & 255) == 128) {
                                        int i45 = i37;
                                        jArr9[i43] = ((~(255 << i44)) & j20) | (((long) (i40 & 127)) << i44);
                                        jArr9[i38] = (jArr9[i38] & (~(255 << i39))) | (128 << i39);
                                        jArr10[iM11182b3] = jArr10[i45];
                                        jArr10[i45] = j12;
                                        i37 = i45;
                                    } else {
                                        int i46 = i37;
                                        jArr9[i43] = (((long) (i40 & 127)) << i44) | ((~(255 << i44)) & j20);
                                        long j21 = jArr10[iM11182b3];
                                        jArr10[iM11182b3] = jArr10[i46];
                                        jArr10[i46] = j21;
                                        i37 = i46 - 1;
                                    }
                                    jArr9[jArr9.length - 1] = (jArr9[0] & j19) | Long.MIN_VALUE;
                                }
                                i37++;
                                i31 = i31;
                                j17 = j19;
                                z2 = z2;
                            } else {
                                i37++;
                            }
                        }
                        z = z2;
                        tv2Var4.f31471e = tv3.m11184a(tv2Var4.f31469c) - tv2Var4.f31470d;
                    }
                    iM11182b = tv2Var4.m11182b(i);
                }
                iNumberOfTrailingZeros2 = iM11182b;
                tv2Var4.f31470d++;
                int i47 = tv2Var4.f31471e;
                long[] jArr11 = tv2Var4.f31467a;
                int i48 = iNumberOfTrailingZeros2 >> 3;
                long j22 = jArr11[i48];
                int i49 = (iNumberOfTrailingZeros2 & 7) << 3;
                tv2Var4.f31471e = i47 - (((j22 >> i49) & 255) == j ? z : 0);
                int i50 = tv2Var4.f31469c;
                long j23 = (j22 & (~(255 << i49))) | (j8 << i49);
                jArr11[i48] = j23;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i50) + (i50 & 7)) >> 3] = j23;
                break;
            }
            i20 += 8;
            i19 = (i19 + i20) & i18;
            i3 = i3;
            i2 = i22;
            j2 = j12;
        }
        tv2Var4.f31468b[iNumberOfTrailingZeros2] = jM10079D;
        return z;
    }
}
