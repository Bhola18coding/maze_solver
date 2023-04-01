/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver_project;

import java.util.List;

/**
 *
 * @author Bholanath Patra
 */
public class DepthFirst {
    public static boolean searchpath(int [][] maze, int x, int y, List<Integer> path)
    {
        //for grid ==9 
        if(maze[y][x]==9)
        {
            path.add(x);
            path.add(y);
            return true;
        }
        
        //for grid == 0
        if(maze[y][x]==0)
        {
            maze[y][x]=2;
            int dx = 1;
            int dy = 0;
            if(searchpath(maze, x+dx, y+dy, path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            
            dx = 1;
            dy = 0;
            if(searchpath(maze, x+dx, y+dy, path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 0;
            dy = -1;
            if(searchpath(maze, x+dx, y+dy, path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
            dx =0;
            dy =1;
            if(searchpath(maze, x+dx, y+dy, path))
            {
                path.add(x);
                path.add(y);
                return true;
            }
        }
        
        return false;
    }
}
