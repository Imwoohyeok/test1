package sec03.brd08.paging;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// controller :
		// - 요청에 따라서 service 호출
		// - service의 결과물을 어떤 view로 보낼지 결정

		// service :
		// - 계산 등의 일을 한다.
		// - dao 호출 담당

		// dao :
		// - DB 담당

		// jsp :
		// - view 담당

		int pageNum = 1; // 현재 페이지를 저장
		int countPerPage = 5; // 한 페이지당 표시 수

		// 널이면 정상작동은 하도록, 안되면 작동은 안하지만 위에적은 페이지 넘버가 적용될 수 있게
		// 안받으면 null 유지하고(위에것 유지되면서 작동되게) 받으면 적용되게
		// 오류발생시 초기값을 사용하게 된다.
		try {
			String tmp_pageNum = request.getParameter("pageNum");
			if (tmp_pageNum != null) {
				pageNum = Integer.parseInt(tmp_pageNum);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		EmpService empService = new EmpService();
		int totalCount = empService.getTotalEmp();

		List<EmpDTO> list = empService.listEmp(pageNum, countPerPage);

		request.setAttribute("pageNum", pageNum);
		request.setAttribute("countPerPage", countPerPage);
		request.setAttribute("totalCount", totalCount);
		request.setAttribute("list", list);
		request.getRequestDispatcher("emp.jsp").forward(request, response);
	}

}
